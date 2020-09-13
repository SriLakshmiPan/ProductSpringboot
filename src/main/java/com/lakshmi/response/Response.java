package com.lakshmi.response;

public class Response {
	private String statusMessage;
	private String statusCode;

	public String getStatus() {
		return statusMessage;
	}

	public void setStatus(String status) {
		this.statusMessage = statusMessage;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
}
