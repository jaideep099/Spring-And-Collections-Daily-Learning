package com.example.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class SchoolStudentService implements StudentService{

	@Override
	public String getfees() {
		System.out.println("Fees of the School student is 20k");
		return "School fees";
	}

}
