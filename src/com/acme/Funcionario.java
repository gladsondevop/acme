package com.acme;

import java.math.BigDecimal;
import java.util.List;

import com.acme.enums.Cargo;
import com.acme.enums.Setor;

public abstract class Funcionario {
	
	private String nome;
	private List<Telefone> telefones;
	private Endereco endereco;
	private BigDecimal salario;
	private Setor setor;
	private Cargo cargo;
	
	public Funcionario(String nome, List<Telefone> telefones, Endereco endereco, BigDecimal salario, Setor setor,
			Cargo cargo) {
		super();
		this.nome = nome;
		this.telefones = telefones;
		this.endereco = endereco;
		this.salario = salario;
		this.setor = setor;
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

	public void setSalario(BigDecimal salario) {
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

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}


}
