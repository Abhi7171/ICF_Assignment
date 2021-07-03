package com.icf.icf_assignment.service.impl;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.icf.icf_assignment.dao.EducationalQualificationRepository;
import com.icf.icf_assignment.entity.Educational_Qualification;
import com.icf.icf_assignment.request.Educational_Qualification_Request;
import com.icf.icf_assignment.service.EducationalQualificationService;

@Service
public class EducationalQualificationServiceImpl implements EducationalQualificationService
{

	@Autowired(required = true)
	private EducationalQualificationRepository eqrepo;
	
	@Override
	public Educational_Qualification registerEducation(@Valid Educational_Qualification_Request eqr) 
	{
		Educational_Qualification equQualification=new Educational_Qualification();
		equQualification.setCourseType(eqr.getCourseType());
		equQualification.setInstitution(eqr.getInstitution());
		equQualification.setInstitutionType(eqr.getInstitutionType());
		equQualification.setInstitutionAddress(eqr.getInstitutionAddress());
		equQualification.setPercentage(eqr.getPercentage());
		equQualification.setStartDate(eqr.getStartDate());
		equQualification.setEndDate(eqr.getEndDate());
		return eqrepo.save(equQualification);
	}
}