package com.desingpartterns.comportamental.command.dispositivo.eletricidade;

import com.desingpartterns.comportamental.command.IComando;

public class EnergiaGeralLigar implements IComando{
	
	private EnergiaGeral energiaGeral;

	public EnergiaGeralLigar(EnergiaGeral energiaGeral) {
		super();
		this.energiaGeral = energiaGeral;
	}

	@Override
	public void executar() {
		energiaGeral.ligar();		
	}

}
