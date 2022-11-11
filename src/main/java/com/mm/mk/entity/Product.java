package com.mm.mk.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	private String productName;
	private Integer qty;
	private Integer price;
}
