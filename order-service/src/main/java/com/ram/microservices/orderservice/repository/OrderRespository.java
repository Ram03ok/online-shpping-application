package com.ram.microservices.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ram.microservices.orderservice.models.Order;

@Repository
public interface OrderRespository extends JpaRepository<Order, Long>{

}
