package com.example.Service;

import java.util.List;

import com.example.DTO.OrderDTO;
import com.example.Entity.Order;

public interface OrderService {

	void saveOrder(OrderDTO dto);
	List<Order> getallorders();
}
