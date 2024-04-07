package com.CRUD.Controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CRUD.Entities.Product;
import com.CRUD.Helper.helper;
import com.CRUD.service.Services;


@RestController
@RequestMapping("product-service")
public class ProductController {

	@Autowired
	private Services Services;
	
	@Autowired
	private helper helper;
	
	@GetMapping("getproduct")
	public List<Product> getproduct(){
		return this.Services.getProduct();
	}
	
	@PostMapping("Createproduct")
	public Product Createproduct(@RequestBody Product product) {
		
		return this.helper.checkproduct(product);
		//return this.Services.createProduct(product);
	}
	
	@GetMapping("byid")
	//http://localhost:8080/product-service/byid?pid=101
	public Product getid(@RequestParam int id) {
		
		System.out.println("tstttting");
		return this.Services.getid(id);
		
	}
	
	@GetMapping("byprice")
	//http://localhost:8080/product-service/byprice?price=1200
	public List<Product> getprice(@RequestParam int price) {
		
		return this.Services.getprice(price);
		
	}
	
	@GetMapping("byjdbcemp")
	
	public List<Map<String, Object>> getprice2(@RequestParam int price) {
		
		return this.Services.getprice2(price);
		
	}
	
	  @PostMapping("duplicate")
	    public ResponseEntity<Object> createProduct(@RequestBody Product product) {
	        // Check if the product with the given ID already exists
	        if (Services.existsById(product.getPid())) {
	            return ResponseEntity.status(HttpStatus.CONFLICT)
	                                 .body("Product with ID " + product.getPid() + " already exists");
	        }

	        // If the product doesn't exist, proceed with insertion
	        Services.createProduct(product);
	        return ResponseEntity.status(HttpStatus.CREATED).body(product);
	    }
	}
	
	
	
