package com.saud_dev.technology_assessment.model.customer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_DEFAULT)
@JsonRootName("affiliate")
public class Affiliate extends Customer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final double AFFILIATE_DISCOUNT = 0.1;

	protected Affiliate() {
		super();
	}
	
	protected Affiliate(double timeAsCustomer) {
		super(timeAsCustomer);
	}	
	
	@Override
	public double getDiscount() {
		return AFFILIATE_DISCOUNT;
	}
}
