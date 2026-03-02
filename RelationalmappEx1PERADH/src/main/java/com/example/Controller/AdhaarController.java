package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.AdhaarDto;
import com.example.Service.AdhaarService;

@RestController
public class AdhaarController {

	@Autowired
	AdhaarService as;
	
	@PostMapping("adhaar")
	ResponseEntity getadhaar(@RequestBody AdhaarDto dto) {
		
		as.addAdhaarForPerson(dto);
		
		return new ResponseEntity(HttpStatus.CREATED);
		
		
	}

	
	
}
