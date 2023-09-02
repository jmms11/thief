package com.teclogi.security.thief.service;

import org.springframework.http.ResponseEntity;

import com.teclogi.security.thief.service.dto.HiddenMoneyDTO;
/**
 * 
 * @author JhonMauricio
 *
 */
public interface ITheftService {

    /**
     * @param HiddenMoneyDTO
     * @return ResponseEntity<Object>
     */
	ResponseEntity<Object> theft(HiddenMoneyDTO hiddenMoneyDTO);
}
