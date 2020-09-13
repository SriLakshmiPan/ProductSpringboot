package com.lakshmi.request;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class AddProductDetailsRequest implements Serializable {

	private static final long serialVersionUID = 3306262202463164113L;
	@Getter
	@Setter
	private Integer id;
	private String name;
	private String details;

	@Override
	public String toString() {
		return "AddProductDetailsRequest[id=" + id + ",Name= " + name + ",Details=" + details + "]";
	}

	public AddProductDetailsRequest(Integer id, String name, String details) {
		this.id = id;
		this.name = name;
		this.details = details;
	}
	
	public AddProductDetailsRequest() {
	}




}
