package com.microservices.service;

public class DTO {

	private String message;
	
	public DTO() {
		
	}
	
	public DTO(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "DTO [message=" + message + "]";
	}

}
