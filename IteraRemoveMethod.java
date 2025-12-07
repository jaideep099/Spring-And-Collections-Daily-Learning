package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class IteraRemoveMethod {

	public static void main(String[] args) {
		
		ArrayList<Book> b=new ArrayList<Book>();
		b.add(new Book(111,"harrypotter","shakespear"));
		b.add(new Book(112,"Lie detector","Nolen"));
		b.add(new Book(113,"Enterperneur","Dumbledore"));
		
		Iterator<Book> itr =b.iterator();
		while(itr.hasNext()) {
			
		Book b1=itr.next();
		if(b1.id==111) 
			itr.remove();
		if(b1.name.equals("Enterperneur"))
			itr.remove();
		}
		
		for(Book b1:b) {
		System.out.println(b1.id+" "+b1.name+" "+ b1.author);
		}

	}

}
