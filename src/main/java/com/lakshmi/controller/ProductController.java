package com.lakshmi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lakshmi.request.AddProductDetailsRequest;
import com.lakshmi.response.AddProductDetailsResponse;

@RestController
@SpringBootApplication
@RequestMapping("/product")
public class ProductController {
	List<AddProductDetailsRequest> productList = new ArrayList<AddProductDetailsRequest>();

	@PostMapping("/addProductDetails")
	public AddProductDetailsResponse addProductDetails(@RequestBody AddProductDetailsRequest request) {
		// Response class with object to callinpostmanresponsebody
		AddProductDetailsResponse response = new AddProductDetailsResponse();
		// productList.add(request);
		// return "Product added";

		try {

			// created object addrsp of AddProductResponseclass productList.add(request);
			System.out.println(response.toString());
			//request.
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return response;

	}

	/*
	 * @GetMapping("/addProductDetailsbyId") public String
	 * getProductDetails(@RequestParam Integer prodid) {
	 * System.out.println("productList" + productList.toString()); for
	 * (AddProductDetailsRequest prod : productList) { if (prod.getId() == prodid) {
	 * return "Product added and Status sucess ";
	 * 
	 * } } return null; }
	 */
}
