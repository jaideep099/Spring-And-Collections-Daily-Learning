//Conversion of Array to collections And collections ton Array
package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Test12 {

	public static void main(String[] args) {
		
		//conversion array to arraylist
		String[] s= {"qwe","asd","zxc"};
		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(s));
		a1.add("jd");
		a1.add("gfd");
		System.out.println(a1);
		
		//conversion arraylist to array
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("rohan");
		a2.add("Mohan");
		String[] s1 = new String[a2.size()];
		a2.toArray(s1);
	//	for(String ss:s1) {
			System.out.println(Arrays.toString(s1));
	//	}
		
			//conversion of Arraylist without generics to array;
			
			ArrayList a3 = new ArrayList();
			a3.add("kash");
			a3.add(102);
			a3.add('c');
			Object[] o = a3.toArray();
			// using object class because it contains different types of elements 
			System.out.println(Arrays.toString(o));
	}

}
