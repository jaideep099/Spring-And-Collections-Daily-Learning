package com.example;

import java.util.ArrayList;

public class Test2 {


	public static void main(String[] args) {
		
		
		ArrayList al= new ArrayList();
		al.add(new Employee("Roy",112));
		al.add(new Student("canon",113));
		
		 Employee e =(Employee)al.get(0);             // Not recommended beacuse in real application you have 	                                              
		 System.out.println(e.name +" " + e.id );        // you have thousand of objects and you dont know at which index which object is there
	
		 
		 // This is not recommended also You have to provide genrics
		Object  o = al.get(1);
			if(o instanceof Employee)
			{
				Employee e1 = (Employee)o;
				System.out.println(e1.name + " "+ e1.id);
			}
			if(o instanceof Student) {
				Student s1 = (Student)o;
				System.out.println(s1.name +" " + s1.id);
			}
		
		

	}
	
}
