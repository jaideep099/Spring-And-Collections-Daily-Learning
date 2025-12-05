package com.example.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test3 {

	public static void main(String[] args) {

String st1= "a";
String st2= "a";
String st3= "a";
	

		System.out.println(st1.hashCode());
		System.out.println(st2.equals(st1));
		
		Set s= new HashSet();
	         s.add(st1);
	         s.add(st2);
	         s.add(st3);
	         
	         
	         
		System.out.println(s);
	}
}

class Students {

	private int id;
	private String name;

//	public int hashCode()
//	{
//		System.out.println( Objects.hash(id,name));
//		
//		return Objects.hash(id,name);
//	}
	
	
	
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o instanceof Students) {
			Students s2 = (Students) o;

			if (this.id == s2.getId()) {
				if (this.name == s2.getName()) {
					return true;
				}

			}

		}
		return false;

	}

	public String toString() {
		return "name = " + name + " id= " + id;
	}

	public Students(int id, String name) {
		this.id = id;
		this.name = name;
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

}