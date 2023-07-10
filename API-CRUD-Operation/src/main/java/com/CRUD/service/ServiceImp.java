package com.CRUD.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRUD.Entities.Product;
import com.CRUD.repositry.Repositry;


@Service
public class ServiceImp implements Services {

	@Autowired
	private Repositry Repos;

	ArrayList Ar=null;
	
	public ServiceImp() {
		Ar=new ArrayList<>();
		//public Product(int pid, String name, String brand, int price)
		Ar.add(new Product(2,"mohit","bata",2000));
	}
	
	@Override
	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		return Repos.findAll();
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return Repos.save(product);
	}
	
	


}
