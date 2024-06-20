package com.acme.funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.acme.enums.Cargo;

public class FuncionarioContratado extends Funcionario {

	public FuncionarioContratado(String nome, BigDecimal salario, Cargo cargo) {
		super(nome, salario, cargo);
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
