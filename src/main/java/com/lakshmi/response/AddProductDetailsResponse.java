package com.lakshmi.response;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class AddProductDetailsResponse implements Serializable{
	
	private static final long serialVersionUID = 4890420663770560005L;
	private String statusMessage;
	private String statusCode;
	
	@Override
	public String toString() {
		return "AddProductDetailsResponse[statusCode=" + statusCode + ",statusMessage= " + statusMessage + "]";
	}
}
