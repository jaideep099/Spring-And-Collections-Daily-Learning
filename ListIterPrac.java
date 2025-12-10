//using hasNext(),hasPrevious(),next(),previous()

package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIterPrac {

	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("rofan");
		al.add("Kaka");
		al.add("Mahi");
		al.add("Rahi");
		
		//without generics you have to typecast int the string beacuse iterator can read all the data in the object class which contains different type of elements
		ListIterator i = al.listIterator();
		while(i.hasNext()) {
			
			String s =(String)i.next();
			System.out.println(s);
			}
		while(i.hasPrevious()) {
			
			String s =(String)i.previous();
			System.out.println(s);
			}
		//	System.out.println("Opreation ended:-");
	
		//with generics its typesafe already
		
		ListIterator<String> i2 = al.listIterator();
		while(i2.hasNext()) {
			
			String s1 =i2.next();
			System.out.println(s1);
			}
		while(i2.hasPrevious()) {
			
			String s1 =i2.previous();
			System.out.println(s1);
			}
	}
}
