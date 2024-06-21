package com.desingpartterns.model;

import java.math.BigDecimal;

import com.desingpartterns.criacional.factory.IFuncionario;

public class FuncionarioContratado implements IFuncionario {
	
	private String nome;
	private BigDecimal salario;

	public FuncionarioContratado(String nome, BigDecimal salario) {
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
		return "FuncionarioContratado [nome=" + nome + ", salario=" + salario + "]";
	}

}
