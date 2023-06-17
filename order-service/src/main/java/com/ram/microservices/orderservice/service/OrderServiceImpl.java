package com.ram.microservices.orderservice.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ram.microservices.orderservice.repository.OrderRespository;

@Service
@Transactional
public class OrderServiceImpl implements OrderService, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8468636240760932018L;
	@Autowired
	private OrderRespository orderRespository;

}
