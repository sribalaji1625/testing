package org.test;

import java.io.File;
import java.util.List;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.UnmarshalException;
import jakarta.xml.bind.Unmarshaller;

public class ReadXml {

	public static void xmlRead() throws JAXBException {
		
	   	 JAXBContext jb = JAXBContext.newInstance(empDetails.class);
		
	   	 Unmarshaller um = jb.createUnmarshaller();
	   	
	   	 File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenFirstTry\\src\\test\\java\\employeexml.xml");
	   	
	   	 Object ob = um.unmarshal(f);
	   	empDetails e =(empDetails)ob;
	   	  
	   	 List<Employee1>e1 = e.getEmployee1(); 
	   	 
	   	 System.out.println("---------------");
	   	 
	   	 System.out.println("sribalaji");
	   	 
	   	 Employee1 sri = e1.get(0);
	   	 
	   	 System.out.println(sri.getId());
	   	 System.out.println(sri.getName());
	   	 System.out.println(sri.getPhone());
	   	 
//	   	Address add = sri.getAddress(); 
//	   	System.out.println(add.getStreet());
//	   	System.out.println(add.getState());
//	   	System.out.println(add.getCity());
//	   	
//	   	
//	   	Mail mail = sri.getMail();
//	   	System.out.println(mail.getOfficical());
//	   	System.out.println(mail.getPersonal());
//	   	
	   	
	}
	public static void main(String[] args) throws JAXBException {
		xmlRead();
		
	}
	
}
	   	
	   	
	   	
	   	
	   	
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	   	 
	
	
	

