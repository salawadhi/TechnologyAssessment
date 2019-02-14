package com.saud_dev.technology_assessment.model.customer;

import com.saud_dev.technology_assessment.constants.Constants;

/**
 * 
 * @author Saud.AlAwadhi
 *
 */

public class CustomerFactory {
	
	private CustomerFactory() {}
	
	public static Customer createCustomer(String customerType, String timeAsCustomer) {
		
		if(customerType.equalsIgnoreCase(Constants.AFFILIATE)) {
			return new Affiliate();
		}
		
		if(customerType.equalsIgnoreCase(Constants.EMPLOYEE)) {
			return new Employee();
		}
	
		if(timeAsCustomer != null)
			return new Customer(Double.parseDouble(timeAsCustomer));
		return new Customer();
	}
}
