package com.example.Service;

import org.springframework.stereotype.Service;

@Service
public class CollegeStudentImpl implements StudentService {

	@Override
	public String getStudent() {
		
		System.out.println("College Student Printed");
		return "Fee of college student is 2l/year";
	}

}
