package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Factory.Factory;
import com.example.Service.practiceService;

@RestController
public class practiceController {

	@GetMapping("print/{type}")
	String Invoice(@PathVariable String type) {
		
		practiceService ps = Factory.createObject(type);
		ps.getData();
		ps.processData();
		return ps.print();
	}
}


