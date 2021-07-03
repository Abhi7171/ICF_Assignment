package com.icf.icf_assignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.icf.icf_assignment.entity.Educational_Qualification;

@Repository
public interface EducationalQualificationRepository extends JpaRepository<Educational_Qualification, Long> 
{
	
}