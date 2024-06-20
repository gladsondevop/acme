package com.acme;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.acme.enums.Cargo;
import com.acme.enums.Setor;
import com.acme.funcionario.FuncionarioContratado;
import com.acme.funcionarioterceirizado.FuncionarioTerceirizado;

public class AppRun {
	
	public static void main(String[] args) {
		criarFuncionarioContratado();
		criarFuncionarioTerceirizado();
	}

	private static void criarFuncionarioContratado() {
		FuncionarioContratado funcionario = 
				new FuncionarioContratado(
						"Gladson Cunha de Albuquerque", 
						new BigDecimal(1000), 
						Cargo.SÊNIOR);
		
		funcionario.setEndereco(getEndereco());
		funcionario.setSetor(Setor.DESENVOLVIMENTO);
		funcionario.setTelefones(getTelefones());
		
		System.out.println(funcionario.toString());
		System.out.println("\tSalário sem reajuste: " + funcionario.getSalario());
		funcionario.aplicarReajusteSalarial(10.0);
		System.out.println("\tSalário com reajuste: " + funcionario.getSalario());
	}
	
	private static void criarFuncionarioTerceirizado() {
		FuncionarioTerceirizado funcionario = 
				new FuncionarioTerceirizado("João Terceiro Terceirizado", 
						new BigDecimal(2000), 
						Cargo.SÊNIOR, 
						getEmpresaContratada(), 
						getPrevisaoPermanencia());
		
		funcionario.setEndereco(getEndereco());
		funcionario.setSetor(Setor.DESENVOLVIMENTO);
		funcionario.setTelefones(getTelefones());
		System.out.println("\n"+funcionario.toString());
	}

	private static LocalDate getPrevisaoPermanencia() {
		return LocalDate.of(2025, 12, 31);
	}

	private static EmpresaContratada getEmpresaContratada() {
		return new EmpresaContratada("Disney");
	}

	private static Endereco getEndereco() {
		return new Endereco("Distrito Federal", "DF", "Gama (Setor Leste)", "Quadra", "22", "Casa 40", "Nas quebrada loka!");
	}

	private static List<Telefone> getTelefones() {
		List<Telefone> telefone = new ArrayList<Telefone>();
		telefone.add(new Telefone("+55", "61988990077"));
		telefone.add(new Telefone("+55", "61995590012"));
		return telefone;
	}

}
