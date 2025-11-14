package com.example.Service;

import org.springframework.stereotype.Service;

@Service
public class SchoolStudentImpl  implements StudentService{

	@Override
	public String getStudent() {
		System.out.println("Scool Student Printed");
		return "Fee of school student is 20k/month";
	}

}
