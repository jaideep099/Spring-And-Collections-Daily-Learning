package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.OrderDTO;
import com.example.Service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService os;
	
	@PostMapping("orders")
	ResponseEntity saveorder(@RequestBody OrderDTO order) {
		
		
		os.saveOrder(order);
		return new ResponseEntity(HttpStatus.CREATED);
		
		
	}
	@GetMapping("orders")
	ResponseEntity getorders() {	
		
		
		
		return new ResponseEntity(os.getallorders(),HttpStatus.OK);
	}
}
