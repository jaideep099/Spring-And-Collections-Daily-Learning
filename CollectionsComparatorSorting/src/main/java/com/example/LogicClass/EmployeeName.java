package com.example.LogicClass;

import java.util.Comparator;

import com.example.Entity.Employee;

public class EmployeeName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		// For ascending sorting return e1.name.compareTo(e2.name);
		return -e1.name.compareTo(e2.name);
	}

}
