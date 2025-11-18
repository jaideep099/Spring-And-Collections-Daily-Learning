package com.example;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {

        ArrayList al = new ArrayList();
        
        al.add(new Student("Jaideep" , 112) );
        al.add(new Employee("jd",200));
        al.add(11);
        al.add("Pune");
        
        for(Object o:al) {
        	
        	if( o instanceof Student) {
        		
        		Student s =  (Student)o;
        		System.out.println(s.name+ " "+ s.id);
        	}
             if( o instanceof Employee) {
        		
        	 Employee e =  (Employee)o;
        		System.out.println(e.name+ " "+ e.id);
        	}
             if(o instanceof Integer) {
            	 System.out.println(o);
             }
        	if(o instanceof String) {
        		System.out.println(o);
        	}
        }
        System.out.println(al.toString());
}
}
