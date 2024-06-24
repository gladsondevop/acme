package com.desingpartterns.comportamental.command.dispositivo.iluminacao;

import com.desingpartterns.comportamental.command.IComando;

public class IluminacaoLigar implements IComando{
	
	private Iluminacao light;

	public IluminacaoLigar(Iluminacao light) {
		super();
		this.light = light;
	}
	
	public void executar() {
		light.ligar();
	}

}
