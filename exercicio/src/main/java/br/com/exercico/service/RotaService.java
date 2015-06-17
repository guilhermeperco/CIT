package br.com.exercico.service;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.exercico.model.Rota;

/**
 * Classe de serviço que implementa as regas de negócio para o calculo de rotas. 
 * 
 * 
 * @author Guilherme
 *
 */
@Path("/rest")
public class RotaService {
	
	
	@POST
	@Path("/cadastroRota")
	public void cadastrarRota(Rota rota){
		
	}
	
	
	@POST
	@Path("/cadastroMapa")
	public void cadastrarMapaRotas(List<Rota> mapa){
		for (Rota rota : mapa) {
			this.cadastrarRota(rota);
		}
	}
	
	@POST
	@Path("/calcularrota")
	@Produces({MediaType.APPLICATION_JSON})
	public void calcularRotaEntrega(){
		
	}
	

}
