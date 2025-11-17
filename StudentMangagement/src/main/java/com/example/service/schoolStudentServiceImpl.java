package com.example.service;






public class schoolStudentServiceImpl implements studentService {

	@Override
	public String printStudent() {
		System.out.println("Fees of school student is 20k");
		return "SChool Student fee architecture";
	}

}
