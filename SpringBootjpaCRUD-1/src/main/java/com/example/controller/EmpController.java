package com.example.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeServiceImpl;

@RestController
@RequestMapping("api/v1")// base url//
public class EmpController 
{
	@Autowired
	private EmployeeServiceImpl empService;
	
	@GetMapping("/getAll")// endpoint
	public ResponseEntity<?> getAllEmp()
	{
		List<Employee> empList = empService.getAllUser();
		if(empList!=null)
		{
			return new ResponseEntity<List<Employee>>(empList,HttpStatus.OK);
		}
		else
		
			return new ResponseEntity<String>("Empty List",HttpStatus.NO_CONTENT);
		
	}
	
	@PostMapping(value="/addEmp", consumes ="application/json; charset=utf-8")// endpoint
	public ResponseEntity<?> addEmps(@RequestBody Employee emp)
		{
			if(empService.addEmp(emp)!=null)
			{
				//System.out.println();
				return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
			}
			else
				
				return new ResponseEntity<String>("Empty List",HttpStatus.CONFLICT);
			
		}
	
	
	//@DeleteMapping......
}











