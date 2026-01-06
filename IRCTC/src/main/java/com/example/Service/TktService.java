package com.example.Service;

import org.springframework.stereotype.Service;

import com.example.Entity.Tkt;


@Service
public interface TktService {

	
	public int saveTkt(Tkt ticket);
	public Tkt getTkt(int id);
}
