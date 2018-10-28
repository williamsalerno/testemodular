package br.com.teste.calculo;

import java.math.BigDecimal;
import java.util.List;

public interface Calculadora {
	
	BigDecimal calcular(List<BigDecimal> valores);

}
