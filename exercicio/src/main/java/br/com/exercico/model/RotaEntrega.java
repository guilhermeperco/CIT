package br.com.exercico.model;


public class RotaEntrega extends BaseModel  {
	
	private static final long serialVersionUID = 1L;
	
	private String destino;
	private double distancia;
	private double custo;
	private String rota;
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public String getRota() {
		return rota;
	}
	public void setRota(String rota) {
		this.rota = rota;
	}
	
	
	

}
