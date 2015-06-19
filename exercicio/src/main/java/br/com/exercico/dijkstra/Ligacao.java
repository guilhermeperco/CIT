package br.com.exercico.dijkstra;

/**
 * Representa uma ligação entre um vertice e outro
 *  
 * @author coelhogp
 *
 */
public class Ligacao {
	
	private final Vertice destino;
    private final double distancia;
    
    public Ligacao(Vertice destino, double distancia){
    	this.destino = destino;
    	this.distancia = distancia;
    }

	public Vertice getDestino() {
		return destino;
	}

	public double getDistancia() {
		return distancia;
	}
    
    
    
    
    
    
}
