package com.mm.mk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.mk.entity.Customer;
import com.mm.mk.service.CustomerService;

@RestController
@RequestMapping("/dmart")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/place")
	public Integer placeOrder(@RequestBody Customer customer) {
		Customer customer2=customerService.placeOrder(customer);
		return customer2.getId();
	}
	
	@GetMapping("/{id}")
	public Customer getById(@PathVariable Integer id) {
		return customerService.getById(id);
	}
	
}
