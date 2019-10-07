package com.example.demo.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@CrossOrigin
@RepositoryRestResource(collectionResourceRel="employee",path="employee")
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
           
	     Employee findByName(String Name);
	 
	    @Query("SELECT t.name,t.teamName FROM Employee t where t.name = ?1") 
	   EmployeesD findByTeamName(@Param("teamname") String teamname);

	   
	    
//		@Override
//		@RestResource(exported=false)
//		Iterable<Employee> findAll();
//		
////		@Override
////		@RestResource(exported=false)
////		Optional<Employee> findById(Long id);
//
//
//		@Override
//		@RestResource(exported=false)
//		void deleteAll(Iterable<? extends Employee> entities);
//		
//		@Override
//		@RestResource(exported=false)
//		void deleteAll();
//		
//		
//		@Override
//		@RestResource(exported=false)
//		<S extends Employee> Iterable<S> saveAll(Iterable<S> entities);
}
	
		
