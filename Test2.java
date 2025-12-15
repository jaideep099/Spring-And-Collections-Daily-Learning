package com.example;

import java.util.ArrayList;

public class Test2 implements Cloneable{

	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("Ram");
		al.add("wer");
		
		ArrayList<String> all = (ArrayList<String>)al.clone();
		
		System.out.println(all);
	}
}
