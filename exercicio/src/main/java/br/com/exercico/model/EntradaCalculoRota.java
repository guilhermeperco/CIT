package br.com.exercico.model;

public class EntradaCalculoRota extends BaseModel {

	private static final long serialVersionUID = 1L;
	private String origem;
	private String destino;
	private double autonomia;
	private double valorCombustivel;
	
	
	public EntradaCalculoRota() {
		super();
	}
	
	public EntradaCalculoRota(String origem, String destino, double autonomia, double valorcombustivel) {
		super();
		
		this.origem = origem;
		this.destino = destino;
		this.autonomia = autonomia;
		this.valorCombustivel = valorcombustivel;
	}
	 
	
	
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
	public double getValorCombustivel() {
		return valorCombustivel;
	}
	public void setValorCombustivel(double valorCombustivel) {
		this.valorCombustivel = valorCombustivel;
	}

	
	
	

}
