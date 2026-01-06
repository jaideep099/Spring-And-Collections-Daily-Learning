package com.example.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Entity.MMTEntity;


@Service
public interface MMTService {

	     ResponseEntity BookTktFromIRCTCDatabase(MMTEntity MMT);
	     ResponseEntity GetTktDataFromIRCTC(int id);
	  
}
