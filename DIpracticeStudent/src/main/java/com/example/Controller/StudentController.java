package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.SchoolStudentImpl;
import com.example.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
ApplicationContext app;
	@GetMapping("print/{Type}")
	String PrintStudent(@PathVariable String Type) {
		StudentService ss = (StudentService)app.getBean(Type);
		return ss.getStudent();
	}
}
