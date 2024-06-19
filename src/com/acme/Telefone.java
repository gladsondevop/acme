package com.acme;

public class Telefone {
	
	private String ddi;
	private String telefone;
	
	public Telefone(String ddi, String telefone) {
		super();
		this.ddi = ddi;
		this.telefone = telefone;
	}

	public String getDdi() {
		return ddi;
	}

	public String getTelefone() {
		return telefone;
	}

	@Override
	public String toString() {
		return "Telefone [ddi=" + ddi + ", telefone=" + telefone + "]";
	}

}
