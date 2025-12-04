package com.example.test;

public class Test1Prac {

	public static void main(String[] args) {
		
		Doctor d1= new Doctor(1,"QWE",765444444,4);
		Doctor d2= new Doctor(3,"abc",765444444,4);
		Doctor d3= new Doctor(1,"erE",765423444,4);
		Doctor d4= new Doctor(9,"QWE",765224444,4);
		
		
		System.out.println(d1.equals(d3)); 
		System.out.println(d1.equals(d2));  
		System.out.println(d1.equals(d4));  
		System.out.println(d1.equals(d1));  
		
	System.out.println();

	System.out.println(d2.equals(d3));   
	System.out.println(d2.equals(d2));   
	System.out.println(d2.equals(d4));  
	System.out.println(d2.equals(d1));
		
System.out.println();


System.out.println(d3.equals(d3));
System.out.println(d3.equals(d2));
System.out.println(d3.equals(d4));
System.out.println(d3.equals(d1));

System.out.println();

System.out.println(d4.equals(d3));
System.out.println(d4.equals(d2));
System.out.println(d4.equals(d4));
System.out.println(d4.equals(d1));
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
