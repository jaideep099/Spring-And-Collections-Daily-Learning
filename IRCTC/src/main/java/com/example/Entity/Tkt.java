package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tkt {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int prn;
	private int coachno;
	private String Passname;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrn() {
		return prn;
	}
	public void setPrn(int prn) {
		this.prn = prn;
	}
	public int getCoachno() {
		return coachno;
	}
	public void setCoachno(int coachno) {
		this.coachno = coachno;
	}
	public String getPassname() {
		return Passname;
	}
	public void setPassname(String passname) {
		Passname = passname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
