package br.com.teste.calculo;

import static java.util.Objects.isNull;

import java.math.BigDecimal;
import java.util.List;

public class CalculoVezes implements Calculadora {
	
	@Override
	public BigDecimal calcular(List<BigDecimal> valores) {
		BigDecimal resultado = null;
		for (BigDecimal valor : valores) {
			if (isNull(resultado)) {
				resultado = valor;
			} else {
				resultado.multiply(valor);
			}
		}
		return resultado;
	}

}
