package com.teclogi.security.thief.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.teclogi.security.thief.service.ITheftService;
import com.teclogi.security.thief.service.dto.HiddenMoneyDTO;
import com.teclogi.security.thief.service.dto.TheftDTO;

/**
 * 
 * @author JhonMauricio
 *
 */
@Service
public class TheftServiceImpl implements ITheftService {
	

	/**
	 * Calcula la máxima cantidad de dinero escondido que se puede robar de diferentes casas.
	 *
	 * @param hiddenMoneyDTO
	 * @return ResponseEntity
	 */
	@Override
	public ResponseEntity<Object> theft(HiddenMoneyDTO hiddenMoneyDTO) {
	    // Comprueba si la matriz de dinero está vacía
	    if (hiddenMoneyDTO.getMoney().length == 0) {
	        // Si la matriz está vacía, devuelve una respuesta con 0 como cantidad robada.
	        return ResponseEntity.ok(new TheftDTO(0));
	    }

	    // Inicializa dos variables para llevar un seguimiento de las cantidades robadas previas.
	    int amountPrv1 = 0;
	    int amountPrv2 = 0;

	    // Itera a través de la matriz de dinero para calcular la cantidad máxima que se puede robar.
	    for (int amount : hiddenMoneyDTO.getMoney()) {
	        // Almacena temporalmente el valor amountPrv1 en una variable temporal.
	        int tmp = amountPrv1;
	        // Actualiza amountPrv1 con la cantidad máxima posible entre la suma de amountPrv2 y el valor actual.
	        amountPrv1 = Math.max(amountPrv2 + amount, amountPrv1);
	        // Actualiza amountPrv2 con el valor previamente almacenado en tmp.
	        amountPrv2 = tmp;
	    }

	    // Devuelve una respuesta  que contiene la cantidad máxima de dinero que se puede robar.
	    return ResponseEntity.ok(new TheftDTO(amountPrv1));
	}


}
