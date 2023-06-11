package com.rammicroservices.productservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rammicroservices.productservice.models.Product;
import com.rammicroservices.productservice.service.ProductService;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
	
	private static Logger logger = LoggerFactory.getLogger(ProductController.class);
	@Autowired
	private ProductService productService;
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/all")
	@ResponseStatus(HttpStatus.CREATED)
	public List<Product> getAllproducts(){
		logger.info("inside ProductController, getAllproducts method");
		return productService.getAllproducts();
	}
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.OK)
	public void createProduct(@RequestBody Product product) {
		logger.info("inside ProductController, createProduct method");
		 productService.saveProduct(product);
	}

}
