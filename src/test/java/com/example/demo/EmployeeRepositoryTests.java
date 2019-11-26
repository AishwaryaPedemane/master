package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeRepository;


@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepositoryTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testSaveEmployee() {
    	try {
        Employee employee = new Employee(1,"Ashishk","Ashishk@gmail.com","development");
        employeeRepository.save(employee);
        Employee employee2 = employeeRepository.findByName("Ashishk");
        if(employee.getName() == "Ashishk") {
        assertEquals(employee2.getName(), employee.getName());
        }else {
        	System.out.println("Employee name is mismatched");
        }
        if(employee != null) {
            assertNotNull(employee);
         }
        assertEquals(employee2.getTeamName(), employee.getTeamName());
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    @Test
    public void testGetEmployee() {

        Employee employee = new Employee(1,"Ashishk","Ashishk@gmail.com","development");
        employeeRepository.save(employee);
        Employee employee2 = employeeRepository.findByName("Ashishk");
        assertNotNull(employee);
        assertEquals(employee2.getName(), employee.getName());
        assertEquals(employee2.getTeamName(), employee.getTeamName());
    }
    
    @Test
    public void testDeleteEmployee() {
        Employee employee = new Employee(1,"Ashishk","Ashishk@gmail.com","development");
        employeeRepository.save(employee);
        employeeRepository.delete(employee);
        Employee employee2 = employeeRepository.findByName("Ashishk");
        assertNotEquals(employee,employee2);
        
    }
    
    @Test
    public void deletByEmployeeIdTest() {
        Employee employee =new Employee(1,"Ashishk","Ashishk@gmail.com","development");
        Employee emp = employeeRepository.save(employee);
        employeeRepository.deleteById(emp.getId());
    }
   
}
