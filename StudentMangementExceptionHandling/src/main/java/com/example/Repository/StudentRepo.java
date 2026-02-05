package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.Entity.Student;
@Service
public interface StudentRepo extends JpaRepository<Student,Integer>{
	boolean existsByName(String name);
	
   List<Student> findByStream(String stream);


}