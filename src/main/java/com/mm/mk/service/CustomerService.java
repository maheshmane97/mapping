package com.mm.mk.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.mk.entity.Customer;
import com.mm.mk.repo.CustomerRepo;
import com.mm.mk.repo.ProductRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	ProductRepo productRepo;
	
	public Customer placeOrder(Customer customer) {
		Customer customer2=customerRepo.save(customer);
		
		return customer;
	}
	
	public Customer getById(Integer id) {
		Customer customer=customerRepo.findById(id).get();
		return customer;
	}
}
