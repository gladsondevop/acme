package com.acme.funcionario;

import java.math.BigDecimal;
import java.util.List;

import com.acme.Endereco;
import com.acme.Telefone;
import com.acme.enums.Cargo;
import com.acme.enums.Setor;

public abstract class Funcionario {
	
	private String nome;
	private List<Telefone> telefones;
	private Endereco endereco;
	private BigDecimal salario;
	private Setor setor;
	private Cargo cargo;
	
	public Funcionario(String nome, BigDecimal salario, Cargo cargo) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	protected void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public Cargo getCargo() {
		return cargo;
	}

}
