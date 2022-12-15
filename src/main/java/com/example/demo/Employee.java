package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="esb")
public class Employee {
	@Id
	public String id;
	
	private String employeeId;
	private String firstName;
	private String lastName;
	private int phoneNumber;
	private String jobId;
	private int salary;
	private String managerId;
	private String departmentId;
	
	}
		

