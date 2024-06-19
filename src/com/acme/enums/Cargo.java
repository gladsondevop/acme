package com.acme.enums;

import java.util.Arrays;
import java.util.Optional;

public enum Cargo {
	
	ESTAGIÁRIO(0), 
	JÚNIOR(1), 
	PLENO(2), 
	SÊNIOR(3);
	
	private final Integer codigo;

	private Cargo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public static Optional<Cargo> buscarPorCodigo(Integer codigo) {
		return Arrays.stream(values())
				.sequential()
				.filter(t -> t.codigo.equals(codigo))
				.findFirst();
	}

}
