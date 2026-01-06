package com.example.Service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Entity.MMTEntity;


@Service
public class MMTServiceImpl implements MMTService{


     RestTemplate rt = new RestTemplate();
     
	@Override
	public ResponseEntity BookTktFromIRCTCDatabase(MMTEntity MMT) {
		
	ResponseEntity response =	rt.postForEntity("http://localhost:8080/ticket", MMT, String.class);
	return response;
	}

	@Override
	public ResponseEntity GetTktDataFromIRCTC(int id) {
		
		    ResponseEntity response    = rt.getForEntity("http://localhost:8080/ticket/" +id, MMTEntity.class);
		return response;
	}

}
