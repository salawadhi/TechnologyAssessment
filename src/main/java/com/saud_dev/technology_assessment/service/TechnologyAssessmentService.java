package com.saud_dev.technology_assessment.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.saud_dev.technology_assessment.constants.Constants;
import com.saud_dev.technology_assessment.model.customer.Customer;
import com.saud_dev.technology_assessment.model.customer.CustomerFactory;
import com.saud_dev.technology_assessment.model.item.Item;
import com.saud_dev.technology_assessment.model.receipt.Receipt;
import com.saud_dev.technology_assessment.model.response.DiscountResponse;

/**
 * 
 * @author Saud.AlAwadhi
 *
 */

@Service
public class TechnologyAssessmentService {
	
	Logger logger = LoggerFactory.getLogger(TechnologyAssessmentService.class);
	
	public String calculateDiscount(Receipt receipt) throws JsonProcessingException {

		DiscountResponse response = new DiscountResponse();

		Customer customer;

		customer = CustomerFactory.createCustomer(receipt.getCustomer(),
				receipt.getTimeAsCustomer());

		response.setCustomerType(receipt.getCustomer());
		response.setOriginalAmount(getTotalAmount(receipt.getItems()));
		response.setDiscountedAmount(getDiscountedAmount(receipt.getItems(), customer));
		response.setFinalAmount(getFinalAmount(receipt.getItems(), customer));
		
		ObjectMapper mapper = new ObjectMapper();
		String json;

		try {
			json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response);
		} catch (JsonProcessingException e) {
			logger.error(e.getOriginalMessage());
			throw e;
		}
		return json;
	}

	private double getFinalAmount(List<Item> items, Customer customer) {

		return getTotalAmount(items) - getDiscountedAmount(items, customer);

	}

	private double getTotalAmount(List<Item> items) {

		double totalAmount = 0d;

		for (Item item : items) {
			totalAmount += Double.parseDouble(item.getValue());
		}

		return totalAmount;

	}

	private double getOtherAmount(List<Item> items) {

		double otherAmount = 0d;

		for (Item item : items) {
			if (!item.getType().equalsIgnoreCase(Constants.GROCERY))
				otherAmount += Double.parseDouble(item.getValue());
		}

		return otherAmount;

	}

	private double getDiscountedAmount(List<Item> items, Customer customer) {

		int flatDiscount = (((int) getTotalAmount(items)) / 100) * 5;

		double percentDiscount = getOtherAmount(items) * customer.getDiscount();

		return flatDiscount + percentDiscount;

	}
}
