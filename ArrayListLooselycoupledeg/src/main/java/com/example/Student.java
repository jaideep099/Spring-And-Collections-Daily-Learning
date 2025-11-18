package com.example;

public class Student implements Person {

	
	String name;
	int id;
	
	Student(String name,int id){
		this.name=name;
		this.id=id;
	}
	@Override
	public String getName() {

		return name;
	}

	@Override
	public int getId() {
		
		return id;
	}
	
	@Override
	public String toString() {
		return name+" "+id;
	}

}
