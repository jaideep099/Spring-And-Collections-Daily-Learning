
//remove(),add(),replace() method

package com.example;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteraMethod {
public static void main(String[] args) {
	
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("rofan");
		al.add("Kaka");
		al.add("Mahi");
		al.add("Rahi");
		
	ListIterator<String> ltr=al.listIterator();
	ltr.add("Sham");
	while(ltr.hasNext()) {
		String s=ltr.next();
		if(s.equals("Mahi"))
			ltr.remove();
		if(s.equals("Rahi"))
			ltr.set("raheem");
	}
		
	System.out.println(al);
}
}
