package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Student;
import com.example.Exception.StudentServiceException;
import com.example.Service.StudentService;

@RestController
public class StudentController {

	
	@Autowired
	StudentService ss;
	
	@PostMapping("Student")
	ResponseEntity addStudent(@RequestBody Student s) {
	
		ss.save(s);
		return new ResponseEntity("Student is saved",HttpStatus.CREATED);
		
	}
	
	@GetMapping("Student/{id}")
	ResponseEntity getStudent(@PathVariable int id) {
			
			Student s =ss.getStudent(id);
			return new ResponseEntity(s, HttpStatus.OK);
			
			
		
	
	}
	
	
}
