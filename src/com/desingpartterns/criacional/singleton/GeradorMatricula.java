package com.desingpartterns.criacional.singleton;

import java.util.Date;

public class GeradorMatricula {
	
	private static GeradorMatricula instance = new GeradorMatricula();
	
	private GeradorMatricula() {}
	
	public static GeradorMatricula getInstance() {
		return instance;
	}
	
	public long novaMatricula() {
		return new Date().getTime();
	}

}
