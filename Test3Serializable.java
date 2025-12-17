package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.example.objectclass.Student;

public class Test3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101,"abc"));
		al.add(new Student(102,"rdc"));
		al.add(new Student(103,"trc"));
		
		// serializable - outputstream to change the class in file 
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
		System.out.println("Serializable process is complete");
		
		//inputstream to change the file into class in another JVM
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Student> all = (ArrayList<Student>)ois.readObject();
		for(Student s:all) {
	
			System.out.println(s.getId()+" "+ s.getName());
		}
		
	}
}
