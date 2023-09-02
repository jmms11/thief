/**
 * 
 */
package com.teclogi.security.thief.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teclogi.security.thief.controller.IThiefController;
import com.teclogi.security.thief.service.ITheftService;
import com.teclogi.security.thief.service.dto.HiddenMoneyDTO;

/**
 * @author JhonMauricio
 *
 */
@RestController
@RequestMapping("/theft")
public class ThiefControllerImpl implements IThiefController {
	/**
	 * Inyección de servicio interno que realiza el tracking
	 */
	@Autowired
	ITheftService theftService;


	/**
	 * @param HiddenMoneyDTO
	 * @return ResponseEntity<Object>
	 */
	@Override
	@PostMapping
	public ResponseEntity<Object> vehicleTracking(@RequestBody HiddenMoneyDTO hiddenMoneyDTO) throws Exception {
		return theftService.theft(hiddenMoneyDTO);
	}
	

}
