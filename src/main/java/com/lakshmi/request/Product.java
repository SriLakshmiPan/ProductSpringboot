package com.lakshmi.request;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = 3306262202463164113L;
	private Integer id;
	private String Name;
	private String Details;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDetails() {
		return Details;
	}

	public void setDetails(String Details) {
		this.Details = Details;
	}

	public void Product() {
	}

	public void Product(Integer id, String Name, String Details) {
		this.id = id;
		this.Name = Name;
		this.Details = Details;
	}

	@Override
	public String toString() {
		return "Product[id=" + id + ",Name= " + Name + ",Details=" + Details + "]";
	}
}
