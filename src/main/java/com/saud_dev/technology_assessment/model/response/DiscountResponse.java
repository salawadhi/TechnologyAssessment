package com.saud_dev.technology_assessment.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("response")
public class DiscountResponse {

	@JsonProperty("customer_type")
	private String customerType;
	
	private double originalAmount;
	
	private double discountedAmount;
	
	private double finalAmount;

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	@JsonProperty("original_amount")
	public String getOriginalAmount() {
		return String.format("%.2f", originalAmount);
	}

	public void setOriginalAmount(double originalAmount) {
		this.originalAmount = originalAmount;
	}

	@JsonProperty("discounted_amount")
	public String getDiscountedAmount() {
		return String.format("%.2f", discountedAmount);
	}

	public void setDiscountedAmount(double discountedAmount) {
		this.discountedAmount = discountedAmount;
	}

	@JsonProperty("final_amount")
	public String getFinalAmount() {
		return String.format("%.2f", finalAmount);
	}

	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}
	
}
