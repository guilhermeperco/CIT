package br.com.exercico.dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import br.com.exercico.model.Rota;

/**
 * Implementação do algoritimo de Dijkstra para calculo do caminho mais curto entre os pontos do mapa
 * 
 * O algoritmo de Dijkstra, concebido pelo cientista da computação holandês Edsger Dijkstra em 1956 
 * e publicado em 19591 2 , soluciona o problema do caminho mais curto num grafo dirigido ou não dirigido 
 * com arestas de peso não negativo, em tempo computacional O([m+n]log n) onde m é o número de arestas
 *  e n é o número de vértices. O algoritmo que serve para resolver o mesmo problema em um grafo 
 *  com pesos negativos é o algoritmo de Bellman-Ford, que possui maior tempo de execução que o Dijkstra.
 * 
 * 
 * @see https://pt.wikipedia.org/wiki/Algoritmo_de_Dijkstra
 * 
 * @author Guilherme Coelho
 *
 */
public class Dijkstra {
	
	private static Dijkstra instance;
	private Map<String, Vertice> mapa;
	
	private Dijkstra (){
		super();
		this.mapa = new HashMap<String, Vertice>();
	}
	
	public static Dijkstra getInstance(){
		if(instance == null){
			instance = new Dijkstra();
		}
		
		return instance;
	}
	
	public void carregaMapa(List<Rota> rotas){
		
		
		for (Rota rota : rotas) {
			Vertice v ;
			if(mapa.containsKey(rota.getOrigem().toUpperCase())){
				v  = mapa.get(rota.getOrigem().toUpperCase());
				
			}else{
				 v = new Vertice(rota.getOrigem().toUpperCase());
			}			
			
			
			if(! mapa.containsKey(rota.getDestino().toUpperCase())){
				mapa.put(rota.getDestino().toUpperCase(), new Vertice(rota.getDestino().toUpperCase()));
			}
			
			v.addLigacao(new Ligacao(mapa.get(rota.getDestino().toUpperCase()), rota.getDistancia()));
			
			mapa.remove(rota.getOrigem().toUpperCase());
			mapa.put(rota.getOrigem().toUpperCase(), v);
		}
	}
	
	public void calculaCaminho(String pontoDePartida) {
		Vertice v = this.mapa.get(pontoDePartida.toUpperCase());
		
		if(v !=null){
			calculaCaminho(v);
		}
	}
	
	public List<Vertice> getMenorCaminhoPAra(String destino){
		
		Vertice v = this.mapa.get(destino.toUpperCase());
		return getMenorCaminhoPAra(v);
	}
	

	private  void calculaCaminho(Vertice origem) {
		
		origem.setMinDistance(0);
		
		PriorityQueue<Vertice> verticeQueue = new PriorityQueue<Vertice>();
		
		verticeQueue.add(origem);

		while (!verticeQueue.isEmpty()) {
			
			Vertice u = verticeQueue.poll();

			// Percorre todas as ligações do vertice
			if(u != null && u.getLigacoes() != null){
				for (Ligacao l : u.getLigacoes()) {
					
					Vertice v = l.getDestino();
					
					double distancia = l.getDistancia();
					
					double distanceThroughU = u.getMinDistance() + distancia;
					
					if (distanceThroughU < v.getMinDistance()) {
						verticeQueue.remove(v);
	
						v.setMinDistance(distanceThroughU);
						v.setPrevious( u);
						verticeQueue.add(v);
					}
				}
			}
		}
	}
	
	
	private  List<Vertice> getMenorCaminhoPAra(Vertice destino)
    {
        List<Vertice> path = new ArrayList<Vertice>();
        
        for (Vertice vertice = destino; vertice != null; vertice = vertice.getPrevious())
            path.add(vertice);

        Collections.reverse(path);
        return path;
    }
	

}
