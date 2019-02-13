package com.saud_dev.technology_assessment.model.item;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("value")
	private String value;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
