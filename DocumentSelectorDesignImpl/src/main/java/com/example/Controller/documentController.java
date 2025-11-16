package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.documentService;
import com.example.service.excelDocumentService;
import com.example.service.pdfDocumentService;


@RestController
public class documentController {

	@GetMapping("print/{type}")
	String Invoice(@PathVariable String type) {
		
	
	documentService ds = Factory.createObject(type);
	
	ds.getData();
	ds.processData();
	return ds.printData();
		
	}

}

class Factory
{
	
	
	    public static documentService createObject(String type)
	        {

	        	if(type.equals("pdf")) 
	        	{
	        		
	        		pdfDocumentService ds = new pdfDocumentService();
	        		
	        		return ds;
	        		}
	        	
	        	
	         if(type.equals("excel")) {
	        		
	        		excelDocumentService ds = new excelDocumentService();
	        		
	        		return ds;
	        		}
	        	
	    
	    return null;
	        	
         }
}
