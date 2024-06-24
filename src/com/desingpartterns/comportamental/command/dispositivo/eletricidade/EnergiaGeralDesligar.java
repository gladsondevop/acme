package com.desingpartterns.comportamental.command.dispositivo.eletricidade;

import com.desingpartterns.comportamental.command.IComando;

public class EnergiaGeralDesligar implements IComando{
	
	private EnergiaGeral energiaGeral;

	public EnergiaGeralDesligar(EnergiaGeral energiaGeral) {
		super();
		this.energiaGeral = energiaGeral;
	}

	@Override
	public void executar() {
		energiaGeral.desligar();		
	}

}
