package com.desingpartterns;

import java.math.BigDecimal;

import com.desingpartterns.comportamental.command.Desligar;
import com.desingpartterns.comportamental.command.IComando;
import com.desingpartterns.comportamental.command.Ligar;
import com.desingpartterns.comportamental.command.Luz;
import com.desingpartterns.comportamental.command.TrocarComando;
import com.desingpartterns.criacional.factory.CriarFuncionarioFactory;
import com.desingpartterns.criacional.factory.FuncionarioFactory;
import com.desingpartterns.criacional.factory.IFuncionario;
import com.desingpartterns.criacional.singleton.GeradorMatricula;
import com.desingpartterns.exception.DesingPartternsException;

public class AppPatterns {
	
	public static void main(String[] args) throws DesingPartternsException {
		
		
		//factory
		FuncionarioFactory factory = new CriarFuncionarioFactory();
		
		IFuncionario funcionarioContratado = 
				factory.getFuncionario("CONTRATADO", "Gladson Cunha de Albuquerque", new BigDecimal(1000));
		funcionarioContratado.getNome();
		funcionarioContratado.getSalario();
		
		IFuncionario funcionarioTerceirizado = 
				factory.getFuncionario("TERCEIRIZADO", "João da Silva", new BigDecimal(3000));
		funcionarioTerceirizado.getNome();
		funcionarioTerceirizado.getSalario();
		
		
		System.out.println(funcionarioContratado);
		System.out.println(funcionarioTerceirizado);
		
		
		//Singleton
		System.out.println("Nova matrícula: "+GeradorMatricula.getInstance().novaMatricula());
		
		
		//Command
		Luz lampada = new Luz();
		IComando ligar = new Ligar(lampada);
		IComando desligar = new Desligar(lampada);
		
		TrocarComando tc = new TrocarComando();
		tc.defineComandoExecuta(ligar);
		tc.defineComandoExecuta(desligar);
		
		System.out.println("");
		
		
	}

}
