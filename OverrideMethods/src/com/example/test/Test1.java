
// Before overriding the .equals method it checks refernce and return according to that but if
// you want to do manual comparison you should override .equal method in child clss acc to your need
// but in hashMap to check for manual comparison you should also override the hashcode() method with equals 
// because it dosenot allow same vlues and for it it checks both hashcode and equal method to compare object 


package com.example.test;

public class Test1 {

	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		
		Student s1= new Student(1,"jd");
		Student s2= new Student(1,"jda");
		
		
System.out.println(s1.equals(e));
	}

}
class Student{
	
	private int id;
	private String name;
	
	@Override
	 public boolean equals(Object o) {
	       
		 if (this == o) 
	        {
	        	return true;
	        }
	        
	       if( o instanceof Student) 
	        {
	        	Student s2 = (Student)o;
	        	
	        	if(this.id==s2.getId())
	        	{
	        		if(this.name==s2.getName()) 
	        		{
	        			return true;
	        		}
	        		
	        		return false;
	        	}
	        }
	        
	        return false;
	    }
	
	
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}


class Employee{
	
}
