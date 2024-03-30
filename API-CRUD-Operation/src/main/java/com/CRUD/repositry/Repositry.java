package com.CRUD.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.CRUD.Entities.Product;

public interface Repositry extends JpaRepository<Product, Integer>{
	
	 List<Product> findByPrice(int price); // Derived query method naming convention

	   // @Query("SELECT p FROM Product p WHERE p.price = :price") // JPQL query
	    @Query("SELECT p FROM Product p WHERE p.pid = 254 AND p.price = :price")
	    List<Product> findByPriceJPQL(int price);

}
