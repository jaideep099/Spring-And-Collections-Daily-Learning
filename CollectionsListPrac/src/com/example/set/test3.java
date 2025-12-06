
//Tree set example
package com.example.set;

import java.util.Comparator;
import java.util.TreeSet;

public class test3 {

	public static void main(String[] args) {
		
		//use comparator constructor  when you want custom sorting like in descending order beacuse naturally treeset is bydefault sorted the elements into ascending order
		TreeSet<String> t= new TreeSet<String>(new Mycomp());
		t.add("baman");
		t.add("raman");
		t.add("aaman");
		t.add("taman");
		System.out.println(t);
		
	}
}
	
 class Mycomp implements Comparator<String>{

		@Override
		public int compare(String s1, String s2) {
			
			return -s1.compareTo(s2);
		}
		
	}

