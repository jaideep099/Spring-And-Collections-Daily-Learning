
// override hashcode() method and equals() .
// if you want to make hashcode of double primitive you have to typecast it into long beacuse hashcode doesnot provide any method forr double but it provide method for long
// for eg  long variable_name = Double.doubleToLongBits(double_variable_name);
// internally it calls doubleToLongBits()

package com.example.test;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test1Prac {

	public static void main(String[] args) {
		
		Doctor d1= new Doctor(1,"QWE",765444444,4);
		Doctor d2= new Doctor(1,"QWE",765444444,4);
		Doctor d3= new Doctor(1,"erE",765423444,4);
		Doctor d4= new Doctor(9,"QWE",765224444,4);
		
		
//		System.out.println(d1.equals(d3)); 
//		System.out.println(d1.equals(d2));  
//		System.out.println(d1.equals(d4));  
//		System.out.println(d1.equals(d1));  
//		
//	System.out.println();
//
//	System.out.println(d2.equals(d3));   
//	System.out.println(d2.equals(d2));   
//	System.out.println(d2.equals(d4));  
//	System.out.println(d2.equals(d1));
//		
//System.out.println();
//
//
//System.out.println(d3.equals(d3));
//System.out.println(d3.equals(d2));
//System.out.println(d3.equals(d4));
//System.out.println(d3.equals(d1));
//
//System.out.println();
//
//System.out.println(d4.equals(d3));
//System.out.println(d4.equals(d2));
//System.out.println(d4.equals(d4));
//System.out.println(d4.equals(d1));


Set s = new LinkedHashSet();
s.add(d1);
s.add(d2);
s.add(d3);
s.add(d4);

System.out.println(s);
System.out.println(d1.hashCode());
System.out.println(d2.hashCode());
System.out.println(d3.hashCode());
System.out.println(d4.hashCode());
	}

}

class Doctor{
	private int id;
	private String name;
	private double mbno;
	private int exp;
	
	Doctor(int id,String name,double mbno,int exp){
		this.id=id;
		this.name=name;
		this.mbno=mbno;
		this.exp=exp;
	}
	
	@Override
	public int hashCode() {
		int result = Integer.hashCode(id);
		
		if(name!=null) {
			result = 31 * result +name.hashCode();
		}
		else {
			result= 31*result;
		}
		
		 result = Integer.hashCode(exp);
		 
		 long conv= Double.doubleToLongBits(mbno);
		 result = 31 * result + Long.hashCode(conv);
		 
		 return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this==obj) {
			return true;
		}
		if(obj instanceof Doctor) 
		{
			Doctor d = (Doctor)obj;
			if(this.id==d.id) 
			{
				if (this.name == d.name) 
				{
					if(this.mbno==d.mbno)
					{
						return true;
					}
				}
			}
			return false;
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		return "id = "+id+" "+"name = "+name+" "+"mbno = "+mbno+" "+"exp = "+exp;
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
	public double getMbno() {
		return mbno;
	}
	public void setMbno(double mbno) {
		this.mbno = mbno;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
}
