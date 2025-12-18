package com.example;

//import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test1 {

	public static void main(String[] args) {
		
		
		//CopyOnWriteArrayList();
		//CopyOnWriteArraySet();
		// ConcurrentHashMap.newKeySet();
		List al = new CopyOnWriteArrayList<>();
		al.add("ABC");
		al.add("AKWK");
		al.add("MAw");
		
		for(Object a:al) {
			//al.add("qtyu");
			al.add("fgh");
			System.out.println(a);
		}
		
		System.out.println(al);
		
	}
}
