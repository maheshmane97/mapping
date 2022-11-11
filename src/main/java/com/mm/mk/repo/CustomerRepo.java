package com.mm.mk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mm.mk.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
