package com.lakshmi.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lakshmi.request.Product;

@RequestMapping("/product")
@RestController
public class ProductController {
	List<Product> productList = new ArrayList<Product>();

	@PostMapping("/addProductDetails")
	public String newProduct(@RequestBody Product newProduct) {
		productList.add(newProduct);
		return "Status sucess and status code is 200";
	}

	@GetMapping("/addProductDetailsbyId")
	public String getProductDetails(@RequestParam Integer prodid) {
		System.out.println("productList" + productList.toString());
		for (Product prod : productList) {
			if (prod.getId() != prodid) {
				return "Status fail and status code is 400";
			}
		}
		return null;
	}
}
