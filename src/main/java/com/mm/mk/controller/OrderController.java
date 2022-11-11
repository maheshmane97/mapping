package com.mm.mk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.mk.dto.OrderRequest;
import com.mm.mk.entity.Customer;
import com.mm.mk.repo.CustomerRepo;
import com.mm.mk.repo.ProductRepo;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/dmart")
@Slf4j
public class OrderController {
	
	@Autowired
	ProductRepo productRepo;
	
	@Autowired
	CustomerRepo customerRepo;
	
	@PostMapping("/place")
	private Customer placeOrder(@RequestBody OrderRequest orderRequest) {
		System.out.println("In place method");
		return customerRepo.save(orderRequest.getCustomer());
	}
	
	@GetMapping
	private List<Customer> allOrders(){
		return customerRepo.findAll();
	}
}
