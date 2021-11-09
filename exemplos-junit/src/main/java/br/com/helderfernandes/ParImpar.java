package br.com.helderfernandes;

public class ParImpar {
	
	private int valor;

	public ParImpar(int valor) {
		this.valor = valor;
	}
	
	public boolean ePar() {
		if(valor % 2 == 0)
			return true;
		return false;
	}
	
	public boolean eImpar() {
		if(!ePar()) {
			return true;
		}
		return false;
	}
	
	
}
