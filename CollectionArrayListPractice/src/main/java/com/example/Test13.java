
// sublist and swap methods
package com.example;

import java.util.ArrayList;
import java.util.Collections;

public class Test13 {

	public static void main(String[] args) {
	
		
		ArrayList<String> a1= new ArrayList<String>();
	
		a1.add("rohan");
		a1.add("Mahesh");
		a1.add("ayan");
		a1.add("jaideep");
		System.out.println("Before Swapping:-"+ a1);
		Collections.swap(a1, 0, 3);
		System.out.println("After Swapping:-"+ a1);
		
		ArrayList<String> a2 = new ArrayList<String>(a1.subList(0, 2));
		a2.add("Ram");
		a2.add("Sham");
		System.out.println(a2);
		
		
	}

}
