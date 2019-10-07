package com.example.demo.model;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.logging.log4j.LogManager;

public class EmployeeValidator implements ConstraintValidator<EmployeeName, String> {
	
		private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(EmployeeValidator.class);
	 
    List<String> employeeName = Arrays.asList("Ashishk", "Amaresh", "Rajat", "Jeet");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
    	LOGGER.info("**********************************");
    	LOGGER.info("WELCOME "+value);
    	LOGGER.info("**********************************");
        return employeeName.contains(value);

    }
}
