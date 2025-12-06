
// treeset sorting using comparator to sort custom object class
package com.example.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.example.object.Employee;

public class testtree {
	public static void main(String[] args) {
		
		TreeSet<Employee> e = new TreeSet<Employee>(new mycomp());
		e.add(new Employee(11, "Baskar"));
		e.add(new Employee(14, "Askar"));
		e.add(new Employee(12, "kareim"));
		e.add(new Employee(15, "Ram"));
		e.add(new Employee(13, "Moosa"));	
		
		
		for(Employee e1:e) {
			System.out.println(e1.id+" "+e1.name);
		}
	}
}

class mycomp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}
