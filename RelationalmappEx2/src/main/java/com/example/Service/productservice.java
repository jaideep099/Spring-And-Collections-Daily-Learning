package com.example.Service;

import java.util.List;

import com.example.Entity.Product;

public interface productservice {

	void saveproduct(Product product);
	List<Product> getallProducts();
}
