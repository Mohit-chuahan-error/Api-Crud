package com.CRUD.service;

import java.util.List;

import com.CRUD.Entities.Product;

public interface Services {

	List<Product> getProduct();

	Product createProduct(Product product);


}
