//package com.example.demo.model;
//
//import java.util.Arrays;
//import java.util.HashSet;
//
//import org.springframework.data.rest.webmvc.BasePathAwareController;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//
//@BasePathAwareController
//public class MyEntityController{
//
//	@PatchMapping
//    HttpEntity<?> patch() {
//        return new ResponseEntity<>(HttpStatus.METHOD_NOT_ALLOWED);
//    }
//		
//	@DeleteMapping
//	 HttpEntity<?> delete() {
//       return new ResponseEntity<>(HttpStatus.METHOD_NOT_ALLOWED);
//   }
//	
//	@PutMapping
//	 HttpEntity<?> put() {
//       return new ResponseEntity<>(HttpStatus.METHOD_NOT_ALLOWED);
//   }
//}