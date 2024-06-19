package com.acme;

public class Endereco {
	
	private String cidade;
	private String uf;
	private String bairro;
	private String logradouro;
	private String numero;
	private String complemento;
	private String pontoReferencia;
	
	public Endereco(String cidade, String uf, String bairro, String logradouro, String numero, String complemento,
			String pontoReferencia) {
		super();
		this.cidade = cidade;
		this.uf = uf;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.pontoReferencia = pontoReferencia;
	}

	public String getCidade() {
		return cidade;
	}

	public String getUf() {
		return uf;
	}

	public String getBairro() {
		return bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getPontoReferencia() {
		return pontoReferencia;
	}

	@Override
	public String toString() {
		return "Endereco [cidade=" + cidade + ", uf=" + uf + ", bairro=" + bairro + ", logradouro=" + logradouro
				+ ", numero=" + numero + ", complemento=" + complemento + ", pontoReferencia=" + pontoReferencia + "]";
	}
}
