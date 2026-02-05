package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.Entity.Student;
import com.example.Exception.StudentServiceException;
import com.example.Repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepo sr;
	
	
	@Override
	public void save(Student s) {
		
		if(s.getAge()<18) {
			
			throw new StudentServiceException("age should be greater than 18", HttpStatus.BAD_REQUEST);
		}
		if(sr.existsByName(s.getName())) {
			
			throw new StudentServiceException("Student is already existed", HttpStatus.CONFLICT);
			
		}
		sr.save(s);
		
	}

	@Override
	public void delete(int id) {
		sr.deleteById(id);
		
	}

	@Override
	public Student getStudent(int id) {
	
		Optional<Student> o=sr.findById(id);
		if(o.isEmpty()) {
			
			
			throw new StudentServiceException("Student is not there",HttpStatus.NO_CONTENT);
		}
		return o.get();
	}

	@Override
	public List<Student> getallStudent() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

}
