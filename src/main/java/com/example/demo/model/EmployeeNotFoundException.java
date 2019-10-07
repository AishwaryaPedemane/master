package com.example.demo.model;

public class EmployeeNotFoundException extends RuntimeException {

	//private static final long serialVersionUID = -906575475467231998L;

	public EmployeeNotFoundException(Long id) {
        super("Employee not found : " + id);
    }

}
