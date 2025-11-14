package com.example.Factory;

import com.example.Service.excelPracticeService;
import com.example.Service.pdfPracticeService;
import com.example.Service.practiceService;

public class Factory {


	public static practiceService createObject(String type)
	{
		
		if(type.equals("pdf")) {
		
			pdfPracticeService pdf = new pdfPracticeService();
				
			return pdf;
				
			};
			if(type.equals("excel")) {
				
				excelPracticeService excel = new excelPracticeService();
					
				return excel;
					
				};
				
				return null;
			
	}
}
