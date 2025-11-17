package com.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Factory.studentFactory;
import com.example.service.studentService;

@RestController
public class studentController {

	
	
@GetMapping	("fee/{type}")
	String printfee(@PathVariable String type) {
	studentService ss = studentFactory.createObject(type);
	return ss.printStudent();
	}
}
