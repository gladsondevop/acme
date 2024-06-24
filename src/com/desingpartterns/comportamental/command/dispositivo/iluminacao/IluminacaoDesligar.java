package com.desingpartterns.comportamental.command.dispositivo.iluminacao;

import com.desingpartterns.comportamental.command.IComando;

public class IluminacaoDesligar implements IComando {
	
	private Iluminacao luz;

	public IluminacaoDesligar(Iluminacao luz) {
		super();
		this.luz = luz;
	}
	
	public void executar() {
		luz.desligar();
	}

}
