package com.example.service;

public class excelDocumentService implements documentService{

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("Get data for excel");
		
	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("process data for excel");
		
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("print excel");
		return "excel";
	}

}
