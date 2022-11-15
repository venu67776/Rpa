/**
 * 
 */
package com.rpa.fas.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({ "/rpa/api/" })
public class RpaController {

	private static final Logger logger = LoggerFactory.getLogger(RpaController.class);

	@GetMapping(value = { "healthCheck" })
	public String healthCheck() {
		logger.info("Entered into RpaController healthCheck api");
		return "RPA Service is Running State... 15-11-2022 10:30 ";
	}

}
