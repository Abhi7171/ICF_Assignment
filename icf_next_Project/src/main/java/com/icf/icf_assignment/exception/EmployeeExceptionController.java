package com.icf.icf_assignment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


//Exception Controller "Employee not found"
@ControllerAdvice
public class EmployeeExceptionController 
{
	@ExceptionHandler(value = EmployeeNotfoundException.class)
	public ResponseEntity<Object> exception(EmployeeNotfoundException exception) 
	{
		return new ResponseEntity<>("Employee not found", HttpStatus.NOT_FOUND);
	}
}