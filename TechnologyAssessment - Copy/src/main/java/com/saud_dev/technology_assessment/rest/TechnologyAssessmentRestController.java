package com.saud_dev.technology_assessment.rest;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.saud_dev.technology_assessment.model.receipt.Receipt;
import com.saud_dev.technology_assessment.service.TechnologyAssessmentService;
import com.saud_dev.technology_assessment.validators.CustomerValidator;
import com.saud_dev.technology_assessment.validators.ItemValidator;
import com.saud_dev.technology_assessment.validators.ReceiptValidator;

/**
 * 
 * @author Saud.AlAwadhi
 *
 */

@RestController
@RequestMapping("/api")
public class TechnologyAssessmentRestController {
	
	Logger logger = LoggerFactory.getLogger(TechnologyAssessmentRestController.class);
			
	@Autowired
	private TechnologyAssessmentService service;
	
	@PostMapping("/get-discounted-receipt")
	public ResponseEntity<String> getCustomerDiscountedReceipt(@RequestBody Receipt receipt) {
		
		ReceiptValidator.validateReceipt(receipt);
		ItemValidator.validateItems(receipt.getItems());
		CustomerValidator.validateCustomer(receipt.getCustomer());
		CustomerValidator.validateTimeAsCustomer(receipt.getTimeAsCustomer());
		
		try {
			return ResponseEntity.ok(service.calculateDiscount(receipt));
		} catch (JsonProcessingException e) {
			logger.error(e.getOriginalMessage());
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error serializing JSON");
		}
		
	}
}
