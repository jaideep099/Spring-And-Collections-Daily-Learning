package com.example;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList<Person> al = new ArrayList<Person>();
		
	//	ArrayList<Object> al = new ArrayList<Object>();
		// if you use object it will allow every objects but it is not type safe . 
		
		
		al.add(new Employee("qwe",101));
		al.add(new Student("Ashish",201));
		al.add(new Employee("Ron",102));
		al.add(new Employee("larry",103));
		al.add(new Employee("garry",104));
		al.add(new Employee("harry",105));
		al.add(new Employee("merry",106));
		
		al.add(new Student("Ashish",201));
		al.add(new Student("Manish",202));
		al.add(new Student("Rakesh",203));
		al.add(new Student("Mahesh",204));
		al.add(new Student("Amit",205));
		al.add(new Student("Jd",206));
		
		for(Object o:al) {
			
			if(o instanceof Person) {
				Person p = (Person)o;
				System.out.println(p.getName()+" "+p.getId());
			}
		}
		
		System.out.println(al);
		
		

	}

}
