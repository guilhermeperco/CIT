package br.com.exercico.model;

import java.util.LinkedList;

public class RotaEntrega extends BaseModel  {
	
	private static final long serialVersionUID = 1L;
	
	LinkedList<Rota> treixo;
	private Double valor;
	public LinkedList<Rota> getTreixo() {
		return treixo;
	}
	public void setTreixo(LinkedList<Rota> treixo) {
		this.treixo = treixo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
	
	

}
