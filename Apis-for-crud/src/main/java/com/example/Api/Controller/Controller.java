package com.example.Api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Api.Entities.Product;
import com.example.Api.services.ProductServices;
@RestController
public class Controller {

	@Autowired
	public ProductServices productServices;
	
	//1
	@GetMapping("getproduct")
	public List<Product> getcourse(){
		
		return this.productServices.getcourse();
	}
	
	//2
	@PostMapping("createproduct")
	public Product createproduct(@RequestBody Product product){
		return this.productServices.createproduct(product);
	}
	
	//3
	@GetMapping("byid")
	public ResponseEntity<Product> getResourceById(@RequestParam int pid)
	{
		Product product=productServices.getRecord(pid);
		if(product==null)
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Product>(product,HttpStatus.OK);
	}
	
	//4
	@GetMapping("byid2")
	public Product getid(@RequestParam int id) {
		return this.productServices.getid(id);
		
	}
	
	//5
	@GetMapping("byname")
	public ResponseEntity<List<Product>> getResourceListByName(@RequestParam String name)
	{
		List<Product> productList=productServices.getListByName(name);
		if(productList.isEmpty())
		{
			return new ResponseEntity<List<Product>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Product>>(productList,HttpStatus.OK);
	}
	
	@GetMapping("Morethan")
	public List<Product> getmoreprice(@RequestParam int price) {
		return this.productServices.morePrice(price);
		
	}
	
	@GetMapping("price-morethan")
	//http://localhost:8080/price-morethan?price=30000
	public List<Product> getmoreprices(@RequestParam int price){
		return this.productServices.morePrices(price);
		
	}
	
	
	
	
}
