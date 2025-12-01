//package com.example;
//
//import java.util.Enumeration;
//import java.util.Iterator;
//import java.util.ListIterator;
//import java.util.Vector;
//
//public class ReadVectorDataUsingCursor {
//
//	public static void main(String[] args) {
//		
//		Vector<Product> v = new Vector<Product>();
//		v.add(new Product(1001,"Iphone",200000));
//		v.add(new Product(1002,"sumsung",250000));
//		v.add(new Product(1003,"vivo",20000));
//		v.add(new Product(1004,"oppo",220000));
//		v.add(new Product(1005,"oneplus",40000));
//		
//		
//		System.out.println();	
//		
//		ListIterator<Product> pltr= v.listIterator();
//		while(pltr.hasNext()) {
//			Product p = pltr.next();
//			if(p.cost==200000)
//				p.cost=150000;
//			System.out.println(p.id+" "+p.name+" "+p.cost);	
//		}
//		System.out.println();
//		
//		Enumeration<Product> p=v.elements();
//		while(p.hasMoreElements()) {
//			Product p2=p.nextElement();
//			System.out.println(p2.id+" "+p2.name+" "+p2.cost);	
//			
//		}
//		System.out.println();
//		Iterator<Product> i = v.iterator();
//		while(i.hasNext()) {
//			Product p3 = i.next();	
//			if(p3.name.equals("vivo"))
//				i.remove();
//		System.out.println(p3.id+" "+p3.name+" "+p3.cost);	
//		
//		}
//	}
//}

package com.example;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ReadVectorDataUsingCursor {

    public static void main(String[] args) {
        
        Vector<Product> v = new Vector<>();
        v.add(new Product(1001,"Iphone",200000));
        v.add(new Product(1002,"sumsung",250000));
        v.add(new Product(1003,"vivo",20000));
        v.add(new Product(1004,"oppo",220000));
        v.add(new Product(1005,"oneplus",40000));
        
        // 1️⃣ Modify cost using ListIterator
        ListIterator<Product> pltr = v.listIterator();
        while(pltr.hasNext()) {
            Product p = pltr.next();
            if(p.cost == 200000)
                p.cost = 150000;

            System.out.println(p.id+" "+p.name+" "+p.cost);
        }

        System.out.println();

        // 2️⃣ Print all elements using Enumeration
        Enumeration<Product> en = v.elements();
        while(en.hasMoreElements()) {
            Product p2 = en.nextElement();
            System.out.println(p2.id+" "+p2.name+" "+p2.cost);
        }

        System.out.println();

        // 3️⃣ Remove "vivo" using Iterator
        Iterator<Product> itr = v.iterator();
        while(itr.hasNext()) 
        {
            Product p3 = itr.next();
            
            if(p3.name.equals("vivo"))
            {
                itr.remove();
                //continue;
            }
           
    }
        }
}

