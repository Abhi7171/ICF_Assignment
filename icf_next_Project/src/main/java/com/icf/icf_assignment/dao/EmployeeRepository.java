package com.icf.icf_assignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.icf.icf_assignment.entity.Employee_Registeration;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee_Registeration, Long> 
{
	@Query(value = "select count(*) from employee_registeration u where u.fname=:fname and u.lname=:lname and u.employementid=:employementid",nativeQuery = true)
	int existsById(
			@Param("fname") String fname , 
			@Param("lname") String lname, 
			@Param("employementid") int employementid);
	
	@Query(value = "select count(employementid) from employee_registeration u where u.employementid=?1",nativeQuery = true)
	int findByEmployementId(int employementid);
	
	@Query(value = "delete from employee_registeration u where u.employementid=:employementid" ,nativeQuery = true)
	int deletebyemployementid(@Param("employementid")int employementid);
}