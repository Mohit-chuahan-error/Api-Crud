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

	@Override
	public Product getid(int id) {
		// TODO Auto-generated method stub
		return Repos.findById(id).orElse(null);
		
	}

	
}