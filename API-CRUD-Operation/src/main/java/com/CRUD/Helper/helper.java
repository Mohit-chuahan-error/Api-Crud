package com.CRUD.Helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.CRUD.Entities.Product;
import com.CRUD.service.Services;

@Component
public class helper {

	
	@Autowired
	private Services Services;
	
	public Product checkproduct(Product product) {
		
		return this.Services.createProduct(product);
		
	}

}
