package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.Entity.Adhaar;

public interface AdhaarRepo extends JpaRepository<Adhaar, Integer> {

	
}
