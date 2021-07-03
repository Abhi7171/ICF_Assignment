package com.icf.icf_assignment.controller;

import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.icf.icf_next_Project.entity.Dependents;
import com.icf.icf_next_Project.request.DependentsRequest;
import com.icf.icf_next_Project.service.DependentsService;

@RestController
public class DependentsController 
{
	@Autowired(required = true)
	private DependentsService ds;
	
	public Logger logger=LoggerFactory.getLogger(DependentsController.class);
	
	@PostMapping("/dependentregister")
	public ResponseEntity<Object> dependentRegisteration(@Valid @RequestBody DependentsRequest dr)
	{
		Dependents d = ds.registerdependent(dr);
		logger.trace("Dependents Detailed Filled");
		return new ResponseEntity<>("Dependents added with DependentId : "+d.getDependentid(),HttpStatus.CREATED);
	}
}