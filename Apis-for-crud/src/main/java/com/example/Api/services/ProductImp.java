package com.example.Api.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Service;

import com.example.Api.Entities.Product;
import com.example.Api.repo.Repo;

@Service
public class ProductImp implements ProductServices {

	@Autowired
	private Repo productRepository;
	
	//1
	@Override
	public List<Product> getcourse() {
		
		return productRepository.findAll();
	}
	
	//2
	@Override
	public Product createproduct(Product product) {
		
		return productRepository.save(product);
	}
	
	//3
	@Override
	public Product getRecord(int pid) 
	{
		return productRepository.findById(pid).orElse(null);
	}
	
	//4
	@Override
	public Product getid(int id) {
		
		return productRepository.findById(id).orElse(null);
	}
	
	//5
	@Override
	public List<Product> getListByName(String name) {
		
		return productRepository.findByName(name);
	}

	@Override
	public List<Product> morePrice(int price) {
		
		return productRepository.morePrice(price);
	}

	@Override
	public List<Product> morePrices(int price) {
		// TODO Auto-generated method stub
		return productRepository.morePrices(price);
	}
	
}
