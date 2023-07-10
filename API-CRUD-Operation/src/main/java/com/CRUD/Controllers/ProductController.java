package com.CRUD.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.CRUD.Entities.Product;
import com.CRUD.service.Services;


@RestController
@RequestMapping("product-service")
public class ProductController {

	@Autowired
	private Services Services;
	
	@GetMapping("exam")
	public String Exam() {
		return "Example : name=Mohit chauhan";
	}
	
	@GetMapping("getproduct")
	public List<Product> getproduct(){
		return this.Services.getProduct();
	}
	
	@PostMapping("Createproduct")
	public Product Createproduct(@RequestBody Product product) {
		return this.Services.createProduct(product);
	}
	
	
	
	
	
	
}
