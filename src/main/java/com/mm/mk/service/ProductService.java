package com.mm.mk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.mk.entity.Product;
import com.mm.mk.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	ProductRepo productRepo;

	public Product getProducts(Integer productId){
		Product products=productRepo.findById(productId).get();
		return products;
	}
}
