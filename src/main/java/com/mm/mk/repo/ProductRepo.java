package com.mm.mk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mm.mk.entity.Product;

public interface ProductRepo  extends JpaRepository<Product, Integer> {

}
