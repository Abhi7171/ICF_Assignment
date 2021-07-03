package com.icf.icf_assignment.service;

import javax.validation.Valid;
import com.icf.icf_assignment.entity.Employee_Registeration;
import com.icf.icf_assignment.request.Employee_Registeration_Request;

public interface EmployeeService 
{
	public Employee_Registeration register(@Valid Employee_Registeration_Request reg);
	public int isEmployeeExists(@Valid String fname,String lname,int employementid);
	public String getEmployeeById(long id);
	public Employee_Registeration update(@Valid Employee_Registeration err, long id);
	public int deletebyemployementid(int id);
}