package com.ram.microservices.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ram.microservices.orderservice.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderService;

}
