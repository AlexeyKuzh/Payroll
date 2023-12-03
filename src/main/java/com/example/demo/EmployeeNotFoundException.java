package com.example.demo;

public class EmployeeNotFoundException extends RuntimeException {
	
	public EmployeeNotFoundException(Long id) {
		super("Could not find employee "+id);
		// TODO Auto-generated constructor stub
	}
	
}
