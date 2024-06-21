package com.desingpartterns.criacional.factory;

import java.math.BigDecimal;

import com.desingpartterns.exception.DesingPartternsException;

public abstract class FuncionarioFactory {
	
	public abstract IFuncionario getFuncionario(String tipoFuncionario, String nome, BigDecimal salario) throws DesingPartternsException;

}
