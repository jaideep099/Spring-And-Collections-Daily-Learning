package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Product;
import com.example.Service.productservice;

@RestController
public class ProductController {

	
	@Autowired
	productservice ps;
	
	
	@PostMapping("Product")
	ResponseEntity saveProduct(@RequestBody Product product) {
		
		ps.saveproduct(product);
		
		return new ResponseEntity(HttpStatus.CREATED);
		
	}
	
	@GetMapping("Product")
	ResponseEntity getallProduct() {
		
	List<Product> products =	ps.getallProducts();
		
		return new ResponseEntity(products,HttpStatus.OK);
		
		
	}
	
	
	
	
}
