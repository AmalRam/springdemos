package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeRepository empService;

	@Override
	public List<Employee> getAllUser()
	{
		List<Employee> empList = empService.findAll();
		if(empList != null && empList.size()>0)
		{
			return empList;
		}
		return null;
		
	}

	@Override
	public Employee addEmp(Employee emp) {
		if(emp!=null)
		{
			return empService.saveAndFlush(emp);
		}
		return null;
	}
	
	

}
