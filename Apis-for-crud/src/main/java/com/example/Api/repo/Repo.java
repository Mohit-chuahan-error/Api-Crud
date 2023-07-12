package com.example.Api.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Api.Entities.Product;

public interface Repo extends JpaRepository<Product,Integer>{

	List<Product> findByName(String name);


	@Query("from Product where price>:arg")
	List<Product> morePrice(@Param("arg") int price);
	
	

	@Query("from Product where price>:arg")
	List<Product> morePrices(@Param("arg") int price);


	
}
