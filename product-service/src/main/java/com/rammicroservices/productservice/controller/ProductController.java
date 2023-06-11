package com.rammicroservices.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rammicroservices.productservice.dto.ProductResponse;
import com.rammicroservices.productservice.models.Product;
import com.rammicroservices.productservice.service.ProductService;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/products")
	@ResponseStatus(HttpStatus.CREATED)
	public List<Product> getAllproducts(){
		return productService.getAllproducts();
	}
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.OK)
	public void createProduct(@RequestBody ProductResponse productResponse) {
		 productService.saveProduct(productResponse);
	}

}
