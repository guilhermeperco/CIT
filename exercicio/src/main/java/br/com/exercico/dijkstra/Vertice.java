package br.com.exercico.dijkstra;

import java.util.LinkedList;
import java.util.List;

public class Vertice implements Comparable<Vertice> {

	private final String name;
//	private Ligacao[] adjacencies;
	private List<Ligacao> ligacoes = new LinkedList<Ligacao>();
	private double minDistance = Double.POSITIVE_INFINITY;
	private Vertice previous;
	

	public Vertice(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public int compareTo(Vertice outro) {
		return Double.compare(minDistance, outro.minDistance);
	}

	
	public double getMinDistance() {
		return minDistance;
	}

	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
	}

	public Vertice getPrevious() {
		return previous;
	}

	public void setPrevious(Vertice previous) {
		this.previous = previous;
	}

	public String getName() {
		return name;
	}
	
	public void addLigacao(Ligacao ligacao){
		this.ligacoes.add(ligacao);
	}

	public List<Ligacao> getLigacoes() {
		return ligacoes;
	}

	public void setLigacoes(List<Ligacao> ligacoes) {
		this.ligacoes = ligacoes;
	}
	
	
	

}
