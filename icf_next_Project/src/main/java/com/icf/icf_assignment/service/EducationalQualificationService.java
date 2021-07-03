package com.icf.icf_assignment.service;

import javax.validation.Valid;

import com.icf.icf_assignment.entity.Educational_Qualification;
import com.icf.icf_assignment.request.Educational_Qualification_Request;

public interface EducationalQualificationService 
{

	public Educational_Qualification registerEducation(@Valid Educational_Qualification_Request eqr);

}