package com.example;

public class Test1Clone implements Cloneable{

	
	int a=10;
	int b=20;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	public static void main(String[] args) throws  CloneNotSupportedException{
	
		
		Test1Clone t1 = new Test1Clone();
		System.out.println(t1.a);
		System.out.println(t1.b);
		
		Test1Clone t2 =  (Test1Clone)t1.clone();
		System.out.println(t2.a);
		System.out.println(t2.b);
	}

}
