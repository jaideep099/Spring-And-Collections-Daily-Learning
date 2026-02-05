package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Student;

@Service
public interface StudentService {

	 public void save(Student s);
	public void delete(int id);
	Student getStudent(int id);
   List<Student> getallStudent();
}
