//hashset example
package com.example.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class test1{

	public static void main(String[] args) {
		
		// use linkedhashset for supporting insertion order otherwise use hashset
		LinkedHashSet<String> h = new LinkedHashSet<String>();
		h.add("Ram");
		h.add("jamam");
		h.add("kaam");
		h.add("naam");
		h.add("Ram");
		System.out.println(h);
		
		HashSet<String> h1 = new HashSet<String>();
		
		// for first insertion kit return true amd for all other duplicates it return false
		System.out.println((h1.add("Ram")));
		System.out.println((h1.add("Ram")));
		System.out.println((h1.add("Ram")));
		
		
		
	}

}
