package com.icf.icf_assignment.service;

import javax.validation.Valid;

import com.icf.icf_assignment.entity.Dependents;
import com.icf.icf_assignment.request.DependentsRequest;

public interface DependentsService 
{
	public Dependents registerdependent(@Valid DependentsRequest dr);
	
}