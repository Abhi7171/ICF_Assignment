package com.icf.icf_assignment.controller;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.icf.icf_assignment.dao.EmployeeRepository;
import com.icf.icf_assignment.entity.Employee_Registeration;
import com.icf.icf_assignment.exception.EmployeeNotfoundException;
import com.icf.icf_assignment.request.EmployeeLoginRequest;
import com.icf.icf_assignment.request.Employee_Registeration_Request;
import com.icf.icf_assignment.service.EmployeeService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

//CRUD Operations Controller for employee
@RestController
public class EmployeeController 
{
	@Autowired(required = true)
	private EmployeeService es;
	
	@Autowired(required = true)
	private EmployeeRepository er;
	
	@GetMapping("/")
	public String home()
	{
		return "<h1><center>Welcome ICF Next </br> Application is ready</center></h1>";
	}
	
	public Logger logger=LoggerFactory.getLogger(EmployeeController.class);
	//CRUD Operations
	
	//  Create Operation  
	//Registeration 
	
	@PostMapping("/register")
	public ResponseEntity<Object> register(@Valid @RequestBody Employee_Registeration_Request err)
	{
		logger.trace("Employee Registeration Started..!!");
		Employee_Registeration er=es.register(err);
		return new ResponseEntity<>("Employee registered : "+er.getEmployementId(),HttpStatus.CREATED);
	}
	
	// Read Operation  
	//  Login  
	
	@PostMapping("/login")
	public ResponseEntity<Object> isEmployeeExists(@Valid @RequestBody EmployeeLoginRequest elr)
	{
		int isEmployeeExist =es.isEmployeeExists(elr.getFname(),elr.getLname(),elr.getEmployementId());
		if(isEmployeeExist>0)
		{
			logger.trace("Employee Login..!!");
			return new ResponseEntity<>("Employee logged in with -->"+"\n"+"EmployementID : "+elr.getEmployementId() +"\nFirst Name : " + elr.getFname()+"\nLast Name : "+elr.getLname(),HttpStatus.OK);
		}
		else
		{
			logger.trace("Error unable to login..!!");
			throw new EmployeeNotfoundException();
		}
	}
	
	
	//Fetching All employees
	
	@GetMapping("/allemployees")
	public String getAllEmployee()
	{
		logger.trace("Employee list");
		return er.findAll().toString();
	}
	
	
	//get employee by ID
	
	@GetMapping("/getbyid/{id}")
	public String getEmployeeById(@PathVariable("id") long id)
	{
		logger.trace("Employee details by ID");
		return es.getEmployeeById(id);
	}
	
	// Delete Operation Perform   
	// Delete employee by ID
	
	@DeleteMapping("/deletebyid/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable("id") long id)
	{
		try
		{
			er.deleteById(id);
			logger.trace("Employee Deleted");
			return new ResponseEntity<>("Employee successfully deleted : "+id,HttpStatus.OK);
		}
		catch (Exception e) 
		{
			logger.trace("Unable to delete employee");
			throw new EmployeeNotfoundException();
		}
	}
	
	//  Delete All Employee  
	
	@DeleteMapping("/alldelete")
	public ResponseEntity<Object> allDelete()
	{
		try
		{
			long x=er.count();
			if(x>0)
			{
				er.deleteAll();
				logger.trace("All Employee Deleted");
				return new ResponseEntity<>("All Employees deleted successfully",HttpStatus.OK);
			}
			else
			{
				logger.trace("unalbe to delete all employees");
				throw new EmployeeNotfoundException();
			}
		}
		catch (Exception e) 
		{
			logger.trace("Employee Not Found");
			throw new EmployeeNotfoundException();
		}
	}
	
	// Update Operation Perform 
	// updating by ID
	
	@PutMapping("/update/{id}")
	public Employee_Registeration updateEmployee(@Valid @RequestBody Employee_Registeration err, @PathVariable("id") long id)
	{
		logger.trace("Employee Updated");
		return es.update(err,id);
	}
	
}