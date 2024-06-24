package com.desingpartterns;

import java.math.BigDecimal;

import com.desingpartterns.comportamental.command.IComando;
import com.desingpartterns.comportamental.command.TrocarComando;
import com.desingpartterns.comportamental.command.dispositivo.iluminacao.IluminacaoDesligar;
import com.desingpartterns.comportamental.command.dispositivo.iluminacao.IluminacaoLigar;
import com.desingpartterns.comportamental.command.dispositivo.eletricidade.EnergiaGeral;
import com.desingpartterns.comportamental.command.dispositivo.eletricidade.EnergiaGeralDesligar;
import com.desingpartterns.comportamental.command.dispositivo.eletricidade.EnergiaGeralLigar;
import com.desingpartterns.comportamental.command.dispositivo.iluminacao.Iluminacao;
import com.desingpartterns.criacional.factory.CriarFuncionarioFactory;
import com.desingpartterns.criacional.factory.FuncionarioFactory;
import com.desingpartterns.criacional.factory.IFuncionario;
import com.desingpartterns.criacional.singleton.GeradorMatricula;
import com.desingpartterns.exception.DesingPartternsException;

public class AppPatterns {
	
	public static void main(String[] args) throws DesingPartternsException {
		
		
		//Disign Pattern Factory
		System.out.println("Disign Pattern FACTORY");
		
		FuncionarioFactory factory = new CriarFuncionarioFactory();
		IFuncionario funcionarioContratado = 
				factory.getFuncionario("CONTRATADO", "Gladson Cunha de Albuquerque", new BigDecimal(1000));
		funcionarioContratado.getNome();
		funcionarioContratado.getSalario();
		
		IFuncionario funcionarioTerceirizado = 
				factory.getFuncionario("TERCEIRIZADO", "João da Silva", new BigDecimal(3000));
		funcionarioTerceirizado.getNome();
		funcionarioTerceirizado.getSalario();
		
		System.out.println("\tFuncionário CONTRATADO");
		System.out.println("\t"+funcionarioContratado);
		System.out.println("\tFuncionário TERCEIRIZADO");
		System.out.println("\t"+funcionarioTerceirizado);
		
		
		//Disign Pattern Singleton
		System.out.println("\nDisign Pattern SINGLETON");
		System.out.println("\tNova matrícula: "+GeradorMatricula.getInstance().novaMatricula());
		
		
		//Command
		System.out.println("\nDisign Pattern COMMAND");
		//Inicia o controle de comandos para execucao
		TrocarComando tc = new TrocarComando();
		
		//Instancia os dispositivos e seus comandos
		System.out.println("\tDispositivo: Energia Geral");
		EnergiaGeral energiaGeral = new EnergiaGeral();
		IComando ligarEnergiaGeral = new EnergiaGeralLigar(energiaGeral);
		IComando desligarEnergiaGeral = new EnergiaGeralDesligar(energiaGeral);
		tc.defineComandoExecuta(ligarEnergiaGeral);
		tc.defineComandoExecuta(desligarEnergiaGeral);
		
		System.out.println("\n\tDispositivo: Iluminação");
		Iluminacao iluminacao = new Iluminacao();
		IComando ligarIluminacao = new IluminacaoLigar(iluminacao);
		IComando desligarIluminacao = new IluminacaoDesligar(iluminacao);
		
		//Executa os camomando definidos
		
		tc.defineComandoExecuta(ligarIluminacao);
		tc.defineComandoExecuta(desligarIluminacao);
		
		System.out.println("");
		
		
	}

}
