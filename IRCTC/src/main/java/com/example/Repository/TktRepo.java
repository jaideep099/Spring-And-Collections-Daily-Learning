package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.Entity.Tkt;


@Service
public interface TktRepo extends JpaRepository<Tkt, Integer>{

}
