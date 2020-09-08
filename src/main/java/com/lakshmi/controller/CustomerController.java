package com.lakshmi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lakshmi.request.Customer;

@RequestMapping("/customer")
@RestController
public class CustomerController {
	List<Customer> customerList = new ArrayList<Customer>();
//http://localhost:8080/customer/addCustomerDetails
	@PostMapping("/addCustomerDetails")
	public String newCustomer(@RequestBody Customer newCustomer) {
		customerList.add(newCustomer);
		return "Customer added";
	}
//http://localhost:8080/customer/getCustomerDetailsbyId?custid=1
	@GetMapping("/getCustomerDetailsbyId")
	public Customer getCustomerDetails(@RequestParam Integer custid) {
		System.out.println("customerList" + customerList.toString());
		for (Customer cust : customerList) {
			if(cust.getId() == custid)
			{
				return cust;
			}
			}
		return null;
	}
}
