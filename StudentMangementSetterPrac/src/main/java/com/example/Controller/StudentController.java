package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentController {
	
	private StudentService ss;
	// setter injection 
	
	@Autowired // use autowired in setter inje
	public void setStudentService(@Qualifier("collegeStudentService") StudentService ss) {
		this.ss = ss;
	}
	
	
	 public StudentController(StudentService ss){
		this.ss= ss;
	}
	
	@GetMapping("fees")	
	String getfees() {
		
		
		return ss.getfees();
	}

}
