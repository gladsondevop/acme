package com.acme.funcionarioterceirizado;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.acme.EmpresaContratada;
import com.acme.enums.Cargo;
import com.acme.funcionario.Funcionario;

public class FuncionarioTerceirizado extends Funcionario {
	
	private EmpresaContratada empresaContratada;
	private LocalDate previsaoPermanencia;

	public FuncionarioTerceirizado(String nome, BigDecimal salario, Cargo cargo, EmpresaContratada empresaContratada, LocalDate previsaoPermanencia) {
		super(nome, salario, cargo);
		this.empresaContratada = empresaContratada;
		this.previsaoPermanencia = previsaoPermanencia;
	}

	public LocalDate getPrevisaoPermanencia() {
		return previsaoPermanencia;
	}

	public void setPrevisaoPermanencia(LocalDate previsaoPermanencia) {
		this.previsaoPermanencia = previsaoPermanencia;
	}

	public EmpresaContratada getEmpresaContratada() {
		return empresaContratada;
	}

	@Override
	public String toString() {
		return "FuncionarioTerceirizado [empresaContratada=" + empresaContratada + ", previsaoPermanencia="
				+ previsaoPermanencia + ", getNome()=" + getNome() + ", getTelefones()=" + getTelefones()
				+ ", getEndereco()=" + getEndereco() + ", getSalario()=" + getSalario() + ", getSetor()=" + getSetor()
				+ ", getCargo()=" + getCargo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
