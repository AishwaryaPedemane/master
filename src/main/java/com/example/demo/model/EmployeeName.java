package com.example.demo.model;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = EmployeeValidator.class)
@Documented
public @interface EmployeeName {

    String message() default "EmployeeDetails is not allowed.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}

