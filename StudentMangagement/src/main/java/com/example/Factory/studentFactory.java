package com.example.Factory;

import com.example.service.collegeStudentServiceImpl;
import com.example.service.schoolStudentServiceImpl;
import com.example.service.studentService;

public class studentFactory {

	public static studentService createObject(String type){
		
		if(type.equals("school")) {
			return new schoolStudentServiceImpl();
		}
		
		if(type.equals("college")) {
			return new collegeStudentServiceImpl();
		}
		return null;
	}
}
