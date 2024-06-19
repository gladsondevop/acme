package com.acme;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.acme.enums.Cargo;
import com.acme.enums.Setor;

public class AppRun {
	
	public static void main(String[] args) {
		
		FuncionarioContratado funcionarioContratado = 
				new FuncionarioContratado(
						"Gladson Cunha de Albuquerque", 
						getTelefones(), 
						getEndereco(), 
						new BigDecimal(1000), 
						Setor.DESENVOLVIMENTO, 
						Cargo.SÊNIOR);
		
		System.out.println("Funcionário Contratado: \n");
		System.out.println("Nome: " + funcionarioContratado.getNome());
		System.out.println(funcionarioContratado.getEndereco().toString());
		System.out.println(funcionarioContratado.getTelefones());
		System.out.println("Setor: " + funcionarioContratado.getSetor());
		System.out.println("Cargo: " + funcionarioContratado.getCargo());
		System.out.println("Salário sem reajuste: " + funcionarioContratado.getSalario());
		//Reajuste Salarial
		funcionarioContratado.aplicarReajusteSalarial(10.0);
		System.out.println("Salário com reajuste: " + funcionarioContratado.getSalario());
		
		
		
		FuncionarioTerceirizado funcionarioTerceirizado = 
				new FuncionarioTerceirizado(
						"João Terceiro Terceirizado", 
						getTelefones(), 
						getEndereco(), 
						new BigDecimal(2000), 
						Setor.BANCO_DE_DADOS, 
						Cargo.SÊNIOR, 
						getEmpresaContratada(), 
						getPrevisaoPermanencia());
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
