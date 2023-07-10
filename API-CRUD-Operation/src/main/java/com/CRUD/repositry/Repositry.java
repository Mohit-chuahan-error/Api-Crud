package com.CRUD.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUD.Entities.Product;

public interface Repositry extends JpaRepository<Product, Integer>{

}
