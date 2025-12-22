// in hashset you have to complusory override the hashcode() method with .equals.


package com.example.test;

import java.util.HashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		
		
		Shop s1= new Shop(101,"Cloth Shop");
		Shop s2= new Shop(101,"Cloth Shop");
		
		System.out.println(s1.equals(s2));
		
          Set s= new HashSet();
          s.add(s1);
          s.add(s2);
          System.out.println(s);
          System.out.println(s1.hashCode());
          System.out.println(s2.hashCode());
          
         
          
	}

}

class Shop{
	
	private int no;
	private String name;
	
	@Override
	 public boolean equals(Object o) {
	       
		 if (this == o) 
	        {
	        	return true;
	        }
	        
	       if( o instanceof Shop) 
	        {
	        	Shop s = (Shop)o;
	        	
	        	if(this.no==s.getNo())
	        	{
	        		if(this.name==s.getName()) 
	        		{
	        			return true;
	        		}
	        		
	        		return false;
	        	}
	        }
	        
	        return false;
	    }
	
	@Override
	public String toString() {
		
		return "no.="+ no +" " + "name="+ name;
	}
	
	
	
	@Override
	public int hashCode() {
	
		int result= Integer.hashCode(no);
		if(name != null) {
			result= 31*result + name.hashCode();
		}
		else {
			result = 31*result;
		}
		return result;
	}
	
	public Shop(int no,String name){
		this.no=no;
		this.name=name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
