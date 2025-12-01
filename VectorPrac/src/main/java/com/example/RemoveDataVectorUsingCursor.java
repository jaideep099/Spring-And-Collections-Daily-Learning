package com.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class RemoveDataVectorUsingCursor {

	public static void main(String[] args) {
	
		
		Vector<Integer> v= new Vector<Integer>();
		for(int i=0;i<=30;i++) {
			v.add(i);
		}
		System.out.println(v);
		Iterator<Integer> i=v.iterator();
		while(i.hasNext())
		{
		Integer I=i.next();
		if(I%2==0) {
			//System.out.println(I);
		}
		else {
			i.remove();
		}
		}
		System.out.println(v);
	}

}
