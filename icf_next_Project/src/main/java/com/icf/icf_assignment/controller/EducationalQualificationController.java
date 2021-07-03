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
import com.icf.icf_assignment.entity.Educational_Qualification;
import com.icf.icf_assignment.request.Educational_Qualification_Request;
import com.icf.icf_assignment.service.EducationalQualificationService;

//Controller for Educational qualification
@RestController
public class EducationalQualificationController 
{
	@Autowired(required = true)
	private EducationalQualificationService edu;
	
	public Logger logger=LoggerFactory.getLogger(EducationalQualificationController.class);
	
	@PostMapping("/registereducation")
	public ResponseEntity<Object> registerEducationQualification(@Valid @RequestBody Educational_Qualification_Request edr)
	{
		Educational_Qualification eq=edu.registerEducation(edr);
		logger.trace("Employee Registering");
		return new ResponseEntity<>("Educational Qualification added with Details : "+"\n"+eq.toString(),HttpStatus.CREATED);
	}
}