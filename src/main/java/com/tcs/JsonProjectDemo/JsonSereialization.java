package com.tcs.JsonProjectDemo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSereialization {
	
	public static void main(String[] args) throws JsonProcessingException {

	Employee e=new Employee();
	e.setEmpId(201);
	e.setEmpName("Krishna");
	e.setGender("Male");
	e.setSalary(55000.00);
    e.setEmail("krish@gmail.com");
    
    List<Address> address=new ArrayList<Address>();
    
    Address a1=new Address();
    a1.setCity("Hyderbad");
    a1.setState("Telangana");
    a1.setPinCode(599599l);
    a1.setCountry("India");
    
    Address a2=new Address();
    a2.setCity("Vizag");
    a2.setState("AndraPradesh");
    a2.setPinCode(544544l);
    a2.setCountry("India");

	Address a3=new Address();
    a3.setCity("Nellore");
    a3.setState("AndraPradesh");
    a3.setPinCode(543322);
    a3.setCountry("India");
    
    address.add(a1);
    address.add(a2);
    address.add(a3);
    
    e.setAddress(address);
    
    ObjectMapper mapper=new ObjectMapper();
    String empJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);
    System.out.println("Employee Json Data : "+empJson);
	}
}
