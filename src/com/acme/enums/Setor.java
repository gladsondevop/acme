package com.acme.enums;

import java.util.Arrays;
import java.util.Optional;

public enum Setor {
	
	DESENVOLVIMENTO(1), 
	DEVOPS(2), 
	BANCO_DE_DADOS(3);
	
	public final Integer codigo;

	private Setor(Integer codigo) {
		this.codigo = codigo;
	}
	
	public static Optional<Setor> buscarPorCodigo(Integer codigo) {
		return Arrays.stream(values())
				.sequential()
				.filter(t -> t.codigo.equals(codigo))
				.findFirst();
	}

}
