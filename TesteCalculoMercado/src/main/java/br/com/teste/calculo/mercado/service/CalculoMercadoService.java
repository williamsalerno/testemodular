package br.com.teste.calculo.mercado.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.teste.calculo.CalculoMenos;

@Service
public class CalculoMercadoService {
	
	public BigDecimal calcularCompras(List<String> valoresParaCalcular) {
		CalculoMenos calculoMenos = new CalculoMenos();
		
		List<BigDecimal> valorParaCalcularList = new ArrayList<>();
		for (String valor : valoresParaCalcular) {
			valorParaCalcularList.add(new BigDecimal(valor));
		}
		
		return calculoMenos.calcular(valorParaCalcularList);
	}

}
