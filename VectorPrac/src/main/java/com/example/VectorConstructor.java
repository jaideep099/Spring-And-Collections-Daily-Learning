
//Vector Constructor Default,size ,size and increment,add collection data to another
package com.example;

import java.util.ArrayList;
import java.util.Vector;

public class VectorConstructor {

	public static void main(String[] args) {
	
		ArrayList<String> al= new ArrayList<>();
		al.add("Ram");
		al.add("Sham");
		al.add("kam");
		
		Vector<String> v= new Vector<String>(al);      //default capacity with increment 10
//		Vector<String> v= new Vector<String>(1);      user capacity with increment of double capacity constructor
//		Vector<String> v= new Vector<String>(1,10);    user capacity and user increment constructor
//      Vector<String> v= new Vector<String>();		
		System.out.println(v.capacity());
		v.add("ASDF");
		v.add("qwert");
	
		System.out.println(v);
		System.out.println(v.capacity());
		

	}

}
