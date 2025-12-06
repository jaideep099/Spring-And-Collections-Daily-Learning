//linkedhashset iterator example
package com.example.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

import com.example.object.Employee;

public class test2 {

	public static void main(String[] args) {
		
		
		LinkedHashSet<Employee> e= new LinkedHashSet<Employee>();
		e.add(new Employee(101,"Jaideep"));
		e.add(new Employee(102,"Amit"));
		e.add(new Employee(103,"Rakesh"));
		e.add(new Employee(104,"Jaideep"));
		e.add(new Employee(105,"Mahesh"));
		
	Iterator<Employee>	itr = e.iterator();
	
while(itr.hasNext()) 
{
	  Employee E= itr.next();
	  System.out.println(E.id+" "+E.name); 
//	  if(E.id == 105)
//		  itr.remove();
	               
}
//for(Employee E:e) {
//	System.out.println(E.id+" "+E.name);
//}
//	
		
		
		
		
		
	}
}
