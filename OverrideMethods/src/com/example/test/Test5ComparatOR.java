package com.example.test;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test5ComparatOR {

	
	public static void main(String[] args) {
		
		Employees11 e1= new Employees11(101, "Aman", "Developer");
		Employees11 e2= new Employees11(129, "Jaideep", "CEO");
		Employees11 e3= new Employees11(110, "Parth", "Manager");
		Employees11 e4= new Employees11(143, "Manish", "Hr");
		
		Comparator c1= new Idcomparator();
		Set s1 = new TreeSet(c1);
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		s1.add(e4);
		
		System.out.println("Sort by id");
		System.out.println();
		System.out.println(s1);
		System.out.println();
		
		/////////////////////////
		////////////////////////
		
		Comparator c2= new Namecomparator();
		Set s2 = new TreeSet(c2);
		s2.add(e1);
		s2.add(e2);
		s2.add(e3);
		s2.add(e4);
		
		System.out.println("Sort by name");
		System.out.println();
		System.out.println(s2);
		System.out.println();
		
		///////////////
		//////////
	
		Comparator c3= new Domaincomparator();
		Set s3 = new TreeSet(c3);
		s3.add(e1);
		s3.add(e2);
		s3.add(e3);
		s3.add(e4);
		
		System.out.println("Sort by Domain");
		System.out.println();
		System.out.println(s3);
		System.out.println();
	}
}

class Idcomparator implements Comparator<Employees11>{

	@Override
	public int compare(Employees11 o1, Employees11 o2) {
		
		return o1.getIdcard()-o2.getIdcard();
	}
	
}
class Namecomparator implements Comparator<Employees11>{

	@Override
	public int compare(Employees11 o1, Employees11 o2) {
		
		return o1.getName().compareToIgnoreCase(o2.getName());
	}
	
}

class Domaincomparator implements Comparator<Employees11>{

	@Override
	public int compare(Employees11 o1, Employees11 o2) {
		
		return o1.getDomain().compareToIgnoreCase(o2.getDomain());
	}
	
}
class Employees11 {
	
	
	private int idcard;
	private String name;
	private String domain;
	public Employees11(int idcard, String name, String domain)
	{
		this.idcard = idcard;
		this.name = name;
		this.domain = domain;
	}
	
	
	@Override
	public String toString() {
		return "Employees11 [idcard=" + idcard + ", name=" + name + ", domain=" + domain; 

	}
	public int getIdcard() {
		return idcard;
	}
	public void setIdcard(int idcard) {
		this.idcard = idcard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
}
