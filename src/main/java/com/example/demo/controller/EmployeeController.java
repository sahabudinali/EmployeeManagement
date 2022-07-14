package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeDetails;
import com.example.demo.service.EmployeeService;

@RestController

@CrossOrigin(origins="*")
public class EmployeeController {
 
	@Autowired 
	private EmployeeService service;
	
	@GetMapping("/get")
	public Iterable<Employee>getEmployee(){
		return service.listAll();
	}
	
	@PostMapping(value ="/save")
	public String saveOrUpdate(@RequestBody Employee emp){
		 service.saveOrUpdate(emp);
         return "Sucess";
	}
	
	@RequestMapping("/employee/{id}")
	private Employee getEmployeeDetails(@PathVariable (name="id")int employeeid){
		 return service.getEmployeeById(employeeid);
         
	}
	
	@PutMapping("edit/{id}")
	public Employee editEmployee(@RequestBody Employee emp, @PathVariable int id){
		 emp.setId(id);
		 service.saveOrUpdate(emp);
		 return emp;
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id){
		service.delete(id);	
		return "Sucess";
	}
	
	
	@PostMapping(value ="/saveCandDetails")
	public String saveOrUpdateCandDetails(@RequestBody EmployeeDetails empDetails){
		 service.saveOrUpdateCandDetails(empDetails);
         return "Sucess";
	}
	
	
}
