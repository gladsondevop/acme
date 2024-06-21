package com.desingpartterns.criacional.factory;

import java.math.BigDecimal;

import com.desingpartterns.exception.DesingPartternsException;
import com.desingpartterns.model.FuncionarioContratado;
import com.desingpartterns.model.FuncionarioTerceirizado;

public class CriarFuncionarioFactory extends FuncionarioFactory {

	@Override
	public IFuncionario getFuncionario(String tipoFuncionario, String nome, BigDecimal salario) throws DesingPartternsException {
		switch(tipoFuncionario) {
			case "CONTRATADO": 
				return new FuncionarioContratado(nome, salario);
			case "TERCEIRIZADO": 
				return new FuncionarioTerceirizado(nome, salario);
			default:
				throw new DesingPartternsException("Lascou!!! Não foi possível criar o funcionário.");
		}
	}

}
