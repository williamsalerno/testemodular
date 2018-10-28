package br.com.teste.calculo;

import static java.util.Objects.isNull;

import java.math.BigDecimal;
import java.util.List;

public class CalculoMais implements Calculadora{
	
	@Override
	public BigDecimal calcular(List<BigDecimal> valores) {
		BigDecimal resultado = null;
		for (BigDecimal valor : valores) {
			if (isNull(resultado)) {
				resultado = new BigDecimal(valor.toString());
			} else {
				resultado = resultado.add(valor);
			}
		}
		return resultado;
	}

}
