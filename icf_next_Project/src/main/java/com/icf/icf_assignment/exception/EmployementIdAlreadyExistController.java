package com.icf.icf_assignment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//Exception controller "Employee preexists"
@ControllerAdvice
public class EmployementIdAlreadyExistController
{
	@ExceptionHandler(value =EmployementIdAlreadyExistException.class)
	public ResponseEntity<Object> exception(EmployementIdAlreadyExistException exception) 
	{
		return new ResponseEntity<>("Employee ID already exists,\n please insert new Employee ID", HttpStatus.NOT_FOUND);
	}
}