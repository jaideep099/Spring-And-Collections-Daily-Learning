package com.example.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.Exception.StudentServiceException;

@ControllerAdvice
public class globalexceptionhandler {

	@ExceptionHandler(exception = StudentServiceException.class)
	ResponseEntity handleserviceexception(StudentServiceException se) {
		
		
		return new ResponseEntity(se.getMessage(),se.gethHttpStatus());
	}
	@ExceptionHandler(exception = Exception.class)
	ResponseEntity handleexception(Exception e) {
		
		
		return new ResponseEntity("something went wrong",HttpStatus.BAD_REQUEST);
		
		
	}
}
