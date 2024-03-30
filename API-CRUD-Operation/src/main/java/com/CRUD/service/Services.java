package com.CRUD.service;

import java.util.List;
import java.util.Map;

import com.CRUD.Entities.Product;

public interface Services {

	List<Product> getProduct();

	Product createProduct(Product product);

	Product getid(int id);

	List<Product> getprice(int price);

	List<Map<String, Object>> getprice2(int price);

	boolean existsById(int pid);

	


}
