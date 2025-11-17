package com.example.service;



public class collegeStudentServiceImpl implements studentService {

	@Override
	public String printStudent() {
		
		System.out.println("College Student fee is 2Lakh");
		return "College student fee architecture";
	}

}
