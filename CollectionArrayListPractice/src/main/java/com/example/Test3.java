package com.example;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("Normal Array");
		
		int[] a= {10,20,30};
		for(int arr:a) {
			
			System.out.print(arr);
		}
		System.out.println();
		
		
		// Using Generics;
		System.out.println("Employee ArrayList:-");
		ArrayList<Employee> e = new ArrayList<Employee>();
		
		e.add(new Employee("ABC",100));
		e.add(new Employee("qwe",101));
		e.add(new Employee("Aert",102));
		e.add(new Employee("qdf",103));
		
		System.out.println();
		System.out.println("Name and Id of the Employees:-");
		for(Employee E:e) {
			
			System.out.println(E.name+ " " + E.id);
			System.out.println();
		
		}
		Employee E1 = e.get(2);
		Employee E2 = e.get(0);
		
		System.out.println("Getting the Name and Id of the specific Employee" );
		System.out.println(E1.name+" "+E2.name+" "+E1.id+" "+E2.id);
		System.out.println();
		System.out.println();
		
		
		System.out.println("Student ArrayList:-");
		ArrayList<Student> s= new ArrayList<Student>();
		s.add(new Student("roy",104));
		s.add(new Student("Karn",105));
		s.add(new Student("alloy",106));
		s.add(new Student("Gigi",107));
	
		System.out.println();
		System.out.println("Name and Id of the Students:-");
		for(Student S:s) {
			
			System.out.println(S.name+" "+S.id);
			System.out.println();
					}
		
		Student S1=s.get(2);
		Student S2=s.get(3);
		
		System.out.println("Getting the Name and Id of the specific Employee" );
		System.out.println(S1.name+" "+S2.name+" "+S1.id+" "+S2.id);
		System.out.println();
		System.out.println(s);
		System.out.println();
		System.out.println(e);
		
	}
}
