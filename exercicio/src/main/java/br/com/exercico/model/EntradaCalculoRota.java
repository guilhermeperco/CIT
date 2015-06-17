package br.com.exercico.model;

public class EntradaCalculoRota extends BaseModel {

	private static final long serialVersionUID = 1L;
	private String origem;
	private String destino;
	private Integer autonomia;
	private Double valorCombustivel;

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

	public Integer getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(Integer autonomia) {
		this.autonomia = autonomia;
	}

	public Double getValorCombustivel() {
		return valorCombustivel;
	}

	public void setValorCombustivel(Double valorCombustivel) {
		this.valorCombustivel = valorCombustivel;
	}

}
