package com.desingpartterns.model;

import java.math.BigDecimal;

import com.desingpartterns.criacional.factory.IFuncionario;

public class FuncionarioTerceirizado implements IFuncionario {
	
	private String nome;
	private BigDecimal salario;
	
	public FuncionarioTerceirizado(String nome, BigDecimal salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public BigDecimal getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return "FuncionarioTerceirizado [nome=" + nome + ", salario=" + salario + "]";
	}
	
}
