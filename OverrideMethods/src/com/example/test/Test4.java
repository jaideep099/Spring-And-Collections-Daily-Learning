package com.example.test;

import java.util.Set;
import java.util.TreeSet;

public class Test4 {

	public static void main(String[] args) {
	
		Studentss s1= new Studentss(12, "J", 1200000);
		Studentss s2= new Studentss(15, "a", 100000);
		Studentss s3= new Studentss(1, "s", 1250000);
		
		
	
		Set set= new TreeSet();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		System.out.println(set);
		
	}

}
class Studentss implements Comparable<Studentss>{
	
	private int id;
	private String name;
	private int salary;
	
	public Studentss(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	

	
	public int compareTo(Studentss o) {
	
		//return this.id-o.getId();
		return this.name.compareToIgnoreCase(o.getName());
	}
	

	public String toString() {
		
		return "id= "+id+" "+"name= "+name+" "+"salary= "+salary;
	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}



	
	
}
