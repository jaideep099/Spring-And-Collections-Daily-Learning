package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.OrderDTO;
import com.example.Entity.Order;
import com.example.Entity.Product;
import com.example.Repository.OrderRepo;
import com.example.Repository.ProductRepo;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepo or;
	
	@Autowired
	ProductRepo pr;
	
	
	@Override
	public void saveOrder(OrderDTO dto) {
		
		Optional<Product> op = pr.findById(dto.getProduct_id());
		if(op.isEmpty()) {
			
			throw new RuntimeException("Product not found");
		}
		Product p = op.get();
		
		Order o = new Order();
		o.setAboutproduct(dto.getDescription());
		o.setProduct(p);
		or.save(o);
		
	}


	@Override
	public List<Order> getallorders() {
		// TODO Auto-generated method stub
		return or.findAll();
	}

}
