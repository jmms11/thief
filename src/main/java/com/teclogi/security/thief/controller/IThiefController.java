package com.teclogi.security.thief.controller;

import org.springframework.http.ResponseEntity;

import com.teclogi.security.thief.service.dto.HiddenMoneyDTO;


/**
 * 
 * @author JhonMauricio
 *
 */
public interface IThiefController {
	
    /**
     * @param HiddenMoneyDTO
     * @return ResponseEntity<Object>
     */
    ResponseEntity<Object> vehicleTracking(HiddenMoneyDTO hiddenMoneyDTO) throws Exception;

}
