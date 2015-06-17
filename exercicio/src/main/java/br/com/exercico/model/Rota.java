package br.com.exercico.model;

import java.io.Serializable;

public class Rota extends BaseModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String origem;
	private String destino;
	private Integer distancia;
	
	public Rota (){
		super();
	}
	
	public Rota (String origem, String destino, Integer distancia){
		this.destino = destino;
		this.origem = origem;
		this.distancia = distancia;
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
	public Integer getDistancia() {
		return distancia;
	}
	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}
	
	

}
