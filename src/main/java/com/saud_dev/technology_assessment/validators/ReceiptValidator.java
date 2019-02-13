package com.saud_dev.technology_assessment.validators;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.saud_dev.technology_assessment.model.receipt.Receipt;

public class ReceiptValidator {

	private ReceiptValidator() {}
	
	public static void validateReceipt(Receipt receipt) {
		
		if(receipt == null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid parameter, receipt cannot be empty");
		}
		
		if(receipt.getCustomer() == null || receipt.getCustomer().isEmpty()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid parameter, customer cannot be empty");
		}
		
		if(receipt.getItems() == null || receipt.getItems().isEmpty()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid parameter: items");
		}
	}
}
