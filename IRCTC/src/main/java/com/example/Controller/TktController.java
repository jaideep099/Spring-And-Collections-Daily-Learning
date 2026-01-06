package com.example.Controller;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Tkt;
import com.example.Service.TktService;

@RestController
public class TktController {

	
	@Autowired
	TktService ts;
	
	@PostMapping("ticket")
	public ResponseEntity saveTicket(@RequestBody Tkt ticket) {
		int tktid = ts.saveTkt(ticket);
		
		
		return new ResponseEntity("Tkt is saved and its id is"+ tktid,HttpStatus.CREATED);
	}
	
	@GetMapping("ticket/{id}")
	public ResponseEntity getTicket(@PathVariable int id) {
		Tkt ticket =  ts.getTkt(id);
		return new ResponseEntity(ticket,HttpStatus.OK);
	}
}
