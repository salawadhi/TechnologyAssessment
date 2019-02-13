package com.saud_dev.technology_assessment.model.customer;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * 
 * @author Saud.AlAwadhi
 *
 */
@JsonInclude(Include.NON_DEFAULT)
@JsonRootName("customer")
public class Customer implements Serializable {
 
	private static final double CUSTOMER_DISCOUNT = 0.05;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("time_as_customer")
	private Double timeAsCustomer = 0d;

	protected Customer(double timeAsCustomer) {
		
		setTimeAsCustomer(timeAsCustomer);
		
	}
	
	protected Customer() {
		super();
	}
	
	public double getDiscount() {
		
		if(this.getTimeAsCustomer() >=2) 
		{
			return CUSTOMER_DISCOUNT;
		}
		
		return 0d;
	}

	public Double getTimeAsCustomer() {
		return timeAsCustomer;
	}

	public void setTimeAsCustomer(Double timeAsCustomer) {
		
		if(timeAsCustomer == null) {
			this.timeAsCustomer = 0d;
		}
		else {
			this.timeAsCustomer = timeAsCustomer;
		}
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
