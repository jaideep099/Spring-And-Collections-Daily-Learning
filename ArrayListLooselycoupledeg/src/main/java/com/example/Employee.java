package com.example;

public class Employee implements Person{

	String name;
	int id;
	
	
	Employee(String name,int id){
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
