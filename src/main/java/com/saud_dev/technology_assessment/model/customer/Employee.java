package com.saud_dev.technology_assessment.model.customer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_DEFAULT)
@JsonRootName("employee")
public class Employee extends Customer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final double EMPLOYEE_DISCOUNT = 0.3;
	
	@Override
	public double getDiscount() {
		return EMPLOYEE_DISCOUNT;
	}
	

}
