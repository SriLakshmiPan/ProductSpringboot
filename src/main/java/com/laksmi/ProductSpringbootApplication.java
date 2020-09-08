package com.laksmi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.lakshmi.controller.ProductController;

@SpringBootApplication
@ComponentScan(basePackageClasses = ProductController.class)
public class ProductSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductSpringbootApplication.class, args);
	}

}