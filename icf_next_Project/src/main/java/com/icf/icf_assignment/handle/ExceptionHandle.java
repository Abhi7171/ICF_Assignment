package com.icf.icf_assignment.handle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandle extends ResponseEntityExceptionHandler
{
	@ExceptionHandler(value = Exception.class)
	public final ResponseEntity<Object> exception(Exception ex)
	{
		return new ResponseEntity<>("please provide a valid entry",HttpStatus.BAD_REQUEST);
	}
}