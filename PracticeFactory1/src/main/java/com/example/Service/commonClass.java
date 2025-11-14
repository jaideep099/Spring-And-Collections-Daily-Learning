package com.example.Service;

abstract class commonClass implements practiceService {

	
	@Override
    public void getData() {
        System.out.println("Get data from database");
    }
	
	@Override
	public String printIn() {
		
		getData();
		processData();
		return print();
	}
	
}
