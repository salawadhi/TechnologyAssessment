package com.saud_dev.technology_assessment.validators;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.saud_dev.technology_assessment.model.item.Item;

public class ItemValidator {
 
	private ItemValidator() {}
	
	public static void validateItems(List<Item> items) {
		
		for (Item item : items) {

			try {
				Double.parseDouble(item.getValue());
			} catch (NumberFormatException e) {
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
						"Invalid Parameter item value for item : " + item.getType() + "," + item.getValue(), e);
			}

		}
	}
	
}
