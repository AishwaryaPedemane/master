package com.example.demo;

import org.apache.tomcat.util.file.ConfigurationSource.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.EmployeeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringRestDataApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration
public class SpringRestDataApplicationTests {
	

	@Test
	public void contextLoads() {
		
	}
	
	
}