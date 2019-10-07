package com.example.demo.model;

import org.springframework.data.rest.core.config.Projection;


@Projection(name = "empd", 
types = { Employee.class }) 
public interface EmployeesD {

	String getName();
	String getTeamName();
	String getId();
}
