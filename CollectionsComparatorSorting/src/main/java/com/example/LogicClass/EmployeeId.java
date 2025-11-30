package com.example.LogicClass;

import java.util.Comparator;

import com.example.Entity.Employee;

public class EmployeeId implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
	
		Employee e2 = (Employee)o2;
// for ascending sorting
		//		if(e1.id==e2.id)
//			return 0;
//		else if(e1.id>e2.id)
//			return 1;
//		else
//			return -1;
	//}
	
	if(e2.id==e1.id)
		return 0;
	else if(e2.id>e1.id)
		return 1;
	else
		return -1;

	}
}
