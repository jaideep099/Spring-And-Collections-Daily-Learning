package com.example.Service;

import org.springframework.stereotype.Service;

@Service
public class CollegeStudentService implements StudentService {

	@Override
	public String getfees() {
		System.out.println("Fees of the College student is 2l");
		return "College fees";
	}

}
