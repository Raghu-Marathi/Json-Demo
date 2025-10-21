package com.tcs.JsonProjectDemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDeSerialization {
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		String json="{\r\n"
				+ "  \"empId\" : 201,\r\n"
				+ "  \"empName\" : \"Krishna\",\r\n"
				+ "  \"salary\" : 55000.0,\r\n"
				+ "  \"gender\" : \"Male\",\r\n"
				+ "  \"email\" : \"krish@gmail.com\",\r\n"
				+ "  \"address\" : [ {\r\n"
				+ "    \"city\" : \"Hyderbad\",\r\n"
				+ "    \"state\" : \"Telangana\",\r\n"
				+ "    \"pinCode\" : 599599,\r\n"
				+ "    \"country\" : \"India\"\r\n"
				+ "  }, {\r\n"
				+ "    \"city\" : \"Vizag\",\r\n"
				+ "    \"state\" : \"AndraPradesh\",\r\n"
				+ "    \"pinCode\" : 544544,\r\n"
				+ "    \"country\" : \"India\"\r\n"
				+ "  } ]\r\n"
				+ "}";
		
		Employee emp=mapper.readValue(json, Employee.class);
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmail());
		System.out.println(emp.getGender());
		System.out.println(emp.getSalary());
		System.out.println(emp.getAddress());
        System.out.println("RRR");
        System.out.println("Hello World");


	}

}
