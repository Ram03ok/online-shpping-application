package com.rammicroservices.productservice.service;

import java.util.List;

import com.rammicroservices.productservice.dto.ProductResponse;
import com.rammicroservices.productservice.models.Product;

public interface ProductService {

	public List<Product> getAllproducts();

	public void saveProduct(ProductResponse productResponse);
}
