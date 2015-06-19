package br.com.exercico.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.exercico.dijkstra.Dijkstra;
import br.com.exercico.dijkstra.Vertice;
import br.com.exercico.model.EntradaCalculoRota;
import br.com.exercico.model.Rota;
import br.com.exercico.model.RotaEntrega;

/**
 * Classe de serviço que implementa as regas de negócio para o calculo de rotas. 
 * 
 * 
 * @author Guilherme
 *
 */
@Path("/rest")
public class RotaService {
	
	
	
	@GET
	@Path("/cadastrarmapa")
	@Consumes({MediaType.APPLICATION_JSON})
	public void cadastrarMapaRotas(List<Rota> mapa){
		
		Dijkstra.getInstance().carregaMapa(mapa);
		
	}
	
	@GET
	@Path("/calcularrota")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public RotaEntrega calcularRotaEntrega(EntradaCalculoRota param){
		
		Dijkstra.getInstance().calculaCaminho(param.getOrigem());
		List<Vertice> caminho = Dijkstra.getInstance().getMenorCaminhoPAra(param.getDestino());
		
		RotaEntrega entrega = new RotaEntrega();
		
		entrega.setDestino(param.getDestino());
		entrega.setDistancia(caminho.get(caminho.size() - 1).getMinDistance());
		entrega.setRota(caminho.toString());
		entrega.setCusto(calcularCusto(param.getAutonomia(), caminho.get(caminho.size() - 1).getMinDistance(), param.getValorCombustivel()));
		
		return entrega;
		
	}
	
	private double calcularCusto(double autonomia, double distancia, double precoConbustivel){
		
		double gastoCombustivel = distancia/autonomia;
		
		return gastoCombustivel * precoConbustivel;
		
	}
	
	@GET
	@Path("/exemplo")
	public List<Rota> getexemplorota(){
		List<Rota> mapa = new ArrayList<Rota>();
		
		mapa.add(new Rota("A","B",5d));
		mapa.add(new Rota("B","C",10d));
		mapa.add(new Rota("C","D",25d));
		mapa.add(new Rota("D","E",12d));
	    mapa.add(new Rota("A","E",10d));
	    
	    return mapa;
	}
	

}
