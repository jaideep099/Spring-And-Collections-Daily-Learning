package com.example.service;

public class pdfDocumentService  implements documentService{

	@Override
	public void getData() {
		
		System.out.println("Get data for pdf");
		
	}

	@Override
	public void processData() {
	
		System.out.println("process data for pdf");
	}

	@Override
	public String printData() {
		
		System.out.println("print pdf");
		return "pdf";
	}

	

}
