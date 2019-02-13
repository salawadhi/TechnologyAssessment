package com.saud_dev.technology_assessment.model.receipt;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.saud_dev.technology_assessment.model.item.Item;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_EMPTY)
public class Receipt {
	
	@JsonProperty("customer")
	private String customer;
	
	@JsonProperty("time_as_customer")
	private String timeAsCustomer;
	
	@JsonProperty("items")
	private List<Item> items;

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getTimeAsCustomer() {
		return timeAsCustomer;
	}

	public void setTimeAsCustomer(String timeAsCustomer) {
		this.timeAsCustomer = timeAsCustomer;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}
