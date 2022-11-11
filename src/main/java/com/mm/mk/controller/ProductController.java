package com.mm.mk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.mk.entity.Product;
import com.mm.mk.repo.ProductRepo;
import com.mm.mk.service.ProductService;

@RestController
@RequestMapping("/dmart/product")
public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping("/{productId}")
	public Product getById(@PathVariable Integer productId) {
		return productService.getProducts(productId);
	}
}
