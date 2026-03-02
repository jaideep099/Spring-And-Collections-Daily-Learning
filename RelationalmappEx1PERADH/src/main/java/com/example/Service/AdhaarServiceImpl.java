package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.AdhaarDto;
import com.example.Entity.Adhaar;
import com.example.Entity.Person;
import com.example.Repository.AdhaarRepo;
import com.example.Repository.PersonRepo;

@Service
public class AdhaarServiceImpl implements AdhaarService {

	@Autowired
	AdhaarRepo ar;
	@Autowired
	PersonRepo pr;
	
	@Override
	public void addAdhaarForPerson(AdhaarDto dto) {
		
		Person p = new Person();
		p.setAddress(dto.getAddress());
		p.setName(dto.getPersonname());
		Person Savedperson = pr.save(p);
		
		
		Adhaar a = new Adhaar();
		a.setAdhaar(dto.getAdhaarnumber());
		a.setPerson(Savedperson);
		ar.save(a);
	}

}
