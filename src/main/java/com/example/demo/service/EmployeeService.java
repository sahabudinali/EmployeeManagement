package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeDetails;
import com.example.demo.repository.EmployeeDetailsRepository;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	private EmployeeDetailsRepository empDetailsRepo;
	
	public Iterable<Employee>listAll(){
		return this.empRepo.findAll();
	}
	
	//saving and update the operation
	public String saveOrUpdate(Employee emp) {
		empRepo.save(emp);
		return "done";
	}
	
	//getting specific record by using the method findById 
	public Employee getEmployeeById(long id) {
		return empRepo.findById(id).get();
	}
	// update the record
	public void update(Employee emp, int id) {
		empRepo.save(emp);
	}
	
	// delete the record
		public String delete(long id) {
			empRepo.deleteById(id);
			return "done";
		}
		
		//saving and update the operation
		public String saveOrUpdateCandDetails(EmployeeDetails empDetails) {
			empDetailsRepo.save(empDetails);
			return "done";
		}	
	
}
