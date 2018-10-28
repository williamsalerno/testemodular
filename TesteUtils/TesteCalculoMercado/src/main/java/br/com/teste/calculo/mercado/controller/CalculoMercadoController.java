package br.com.teste.calculo.mercado.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.calculo.mercado.service.CalculoMercadoService;

@RestController
public class CalculoMercadoController {
	
	@Autowired
	private CalculoMercadoService calculoMercadoService;
	
	 @PostMapping("/somar")
	    public ResponseEntity<?> getTeste(@RequestBody List<String> valoresParaCalcular) {
	        return new ResponseEntity<>(calculoMercadoService.calcularCompras(valoresParaCalcular), HttpStatus.IM_USED);
	    }

}
