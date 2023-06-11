package com.rammicroservices.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rammicroservices.productservice.dto.ProductResponse;
import com.rammicroservices.productservice.models.Product;
import com.rammicroservices.productservice.repository.ProductRepository;

import lombok.Builder;

@Service
@Builder
public class ProductServiceImplementations implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	public ProductServiceImplementations(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	@Override
	public List<Product> getAllproducts() {
		return productRepository.findAll();
	}
	@Override
	public void saveProduct(ProductResponse productResponse) {
		Product product = Product.builder()
				.name(productResponse.getName())
				.description(productResponse.getDescription())
				.price(productResponse.getPrice())
				.build();
	}

}
