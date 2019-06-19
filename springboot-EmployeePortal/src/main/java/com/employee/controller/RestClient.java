package com.employee.controller;
/*package net.guides.springboot2.springboot2jpacrudexample.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import net.guides.springboot2.springboot2jpacrudexample.model.Employee;

public class RestClient {
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${url}")
	public String baseUrl;
	//String baseUrl="http://localhost:2020/api/v1/";
	public void getUsers(){
		System.out.println(baseUrl);
	ResponseEntity<String> response=null;
	try{
	response=restTemplate.exchange(baseUrl+"/employees",
			HttpMethod.GET, getHeaders(),String.class);
	}catch (Exception ex)
	{
		System.out.println(ex);
	}
	System.out.println(response.getBody());
}
	
	public void createUsers(){
		System.out.println(baseUrl);
		ResponseEntity<Employee> response=null;
	try{
		Employee employee = new Employee();
		employee.setEmailId("admin@gmail.com");
		employee.setFirstName("admin");
		employee.setLastName("admin");
	response=restTemplate.postForEntity(baseUrl+"/employees",
			employee, Employee.class);
	}catch (Exception ex)
	{
		System.out.println(ex);
	}
	System.out.println(response.getBody());
}

private static HttpEntity<?> getHeaders() throws IOException {
	HttpHeaders headers = new HttpHeaders();
	headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
	return new HttpEntity<>(headers);
}
}

*/