package com.example.Exception;

import org.springframework.http.HttpStatus;

public class StudentServiceException extends  RuntimeException{
	
	private String message;
	private HttpStatus httpstatus;

	public StudentServiceException(String message,HttpStatus httpstatus) 
	{
		
		this.message = message;
		this.httpstatus= httpstatus;
	}
public HttpStatus gethHttpStatus() {
	
	return httpstatus;
	
}
	@Override
	public String getMessage() {
		
		return message;
	}
	
}