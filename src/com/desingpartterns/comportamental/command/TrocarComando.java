package com.desingpartterns.comportamental.command;

import java.util.ArrayList;
import java.util.List;

public class TrocarComando {
	
	private List<IComando> comandos = new ArrayList<IComando>();
	
	public void defineComandoExecuta(IComando comando) {
		comandos.add(comando);
		comando.executar();
	}

}
