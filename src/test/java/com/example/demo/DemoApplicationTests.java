package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.controller.EmployeeController;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	EmployeeService emps;
	
	@Test
	void contextLoads() {
	   
	}

}
