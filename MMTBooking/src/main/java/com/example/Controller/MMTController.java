package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.MMTEntity;
import com.example.Service.MMTService;

@RestController
public class MMTController {
	
	@Autowired
	MMTService ms;
	
	@PostMapping("MMT/Ticket")
	public ResponseEntity bookTicket(@RequestBody MMTEntity MMT) {
	     
		ResponseEntity r= ms.BookTktFromIRCTCDatabase(MMT);
		return r;
	}
	
	@GetMapping("MMT/Ticket/{id}")
	public ResponseEntity getTicket(@PathVariable  int id) {
		
		    ResponseEntity re= ms.GetTktDataFromIRCTC(id);
		    return re;
	}
	
}
