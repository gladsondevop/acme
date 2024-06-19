package com.acme;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import com.acme.enums.Cargo;
import com.acme.enums.Setor;

public class FuncionarioContratado extends Funcionario {

	public FuncionarioContratado(String nome, List<Telefone> telefones, Endereco endereco, BigDecimal salario,
			Setor setor, Cargo cargo) {
		super(nome, telefones, endereco, salario, setor, cargo);
	}

	public void aplicarReajusteSalarial(Double percentualReajuste) {
		setSalario(getSalario()
				.add(getSalario()
						.multiply(new BigDecimal(percentualReajuste/100)))
				.setScale(2, RoundingMode.FLOOR));
	}

	@Override
	public String toString() {
		return "FuncionarioContratado [getNome()=" + getNome() + ", getTelefones()=" + getTelefones()
				+ ", getEndereco()=" + getEndereco() + ", getSalario()=" + getSalario() + ", getSetor()=" + getSetor()
				+ ", getCargo()=" + getCargo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
