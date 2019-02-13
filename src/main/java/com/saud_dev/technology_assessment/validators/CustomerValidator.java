package com.saud_dev.technology_assessment.validators;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.saud_dev.technology_assessment.constants.Constants;

public class CustomerValidator {

	private CustomerValidator() {}
	
	public static void validateCustomer(String customer) {
		
		if(customer == null || customer.isEmpty())
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid parameter, customer cannot be empty");
		
		if(!customer.equalsIgnoreCase(Constants.AFFILIATE) && !customer.equalsIgnoreCase(Constants.CUSTOMER) && !customer.equalsIgnoreCase(Constants.EMPLOYEE))
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid parameter for customer type: " + customer);

	}
	
	public static void validateTimeAsCustomer(String timeAsCustomer) {
		
		if(timeAsCustomer != null) {
			
			try {
				Double.parseDouble(timeAsCustomer);
			} catch (NumberFormatException e) {
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
						"Invalid Parameter value for time_as_customer: " + timeAsCustomer, e);
			}
			
		}
		
	}
}
