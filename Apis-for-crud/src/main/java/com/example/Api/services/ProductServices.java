package com.example.Api.services;

import java.util.List;

import com.example.Api.Entities.Product;

public interface ProductServices {
	List<Product> getcourse();
	Product createproduct(Product product);
	Product getRecord(int pid);
	Product getid(int id);
	
	List<Product> getListByName(String name);
	
	List<Product> morePrices(int price);
	List<Product> morePrice(int price);
	
	

}
