package com.desingpartterns.comportamental.command;

public class Ligar implements IComando{
	
	private Luz light;

	public Ligar(Luz light) {
		super();
		this.light = light;
	}
	
	public void executar() {
		light.ligar();
	}

}
