package com.desingpartterns.comportamental.command;

public class Desligar implements IComando {
	
	private Luz luz;

	public Desligar(Luz luz) {
		super();
		this.luz = luz;
	}
	
	public void executar() {
		luz.desligar();
	}

}
