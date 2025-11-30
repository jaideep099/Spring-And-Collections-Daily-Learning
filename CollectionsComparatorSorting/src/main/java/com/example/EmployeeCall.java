package com.example;

import java.util.ArrayList;
import java.util.Collections;

import com.example.Entity.Employee;
import com.example.LogicClass.EmployeeId;
import com.example.LogicClass.EmployeeName;

public class EmployeeCall {

	public static void main(String[] args) {
	
		ArrayList<Employee> al= new ArrayList<Employee>();
		al.add(new Employee(21,"Ganesh"));
		al.add(new Employee(27,"Ramesh"));
		al.add(new Employee(25,"Anmish"));
		al.add(new Employee(29,"Kashera"));
		al.add(new Employee(23,"Makhira"));
		
		Collections.sort(al,new EmployeeId());
		for(Employee e: al) {
			System.out.println(e.id +" "+ e.name);
		}
		
	}

}
