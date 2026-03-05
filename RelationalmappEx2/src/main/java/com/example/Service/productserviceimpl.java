package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Product;
import com.example.Repository.ProductRepo;

@Service
public class productserviceimpl implements productservice{

	
	@Autowired
	ProductRepo pr;
	
	
	
	@Override
	public void saveproduct(Product product) {
		
		pr.save(product);
	}

	@Override
	public List<Product> getallProducts() {
		
		return pr.findAll();
	}

	
}
