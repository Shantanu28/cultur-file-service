package io.cultr.file.services.enums;

public enum GroupType {

	EVENTS("EVENTS");
	
	String value;
	
	GroupType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
