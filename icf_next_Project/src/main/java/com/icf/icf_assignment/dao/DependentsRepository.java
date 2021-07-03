package com.icf.icf_assignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icf.icf_assignment.entity.Dependents;

@Repository
public interface DependentsRepository extends JpaRepository<Dependents, Long> 
{
	
}