package com.icf.icf_assignment.service.impl;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.icf.icf_assignment.dao.EmployeeRepository;
import com.icf.icf_assignment.entity.Employee_Registeration;
import com.icf.icf_assignment.exception.EmployeeNotfoundException;
import com.icf.icf_assignment.exception.EmployementIdAlreadyExistException;
import com.icf.icf_assignment.request.Employee_Registeration_Request;
import com.icf.icf_assignment.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired(required = true)
	private EmployeeRepository er;
	
	@Override
	public Employee_Registeration register(@Valid Employee_Registeration_Request reg) 
	{
		Employee_Registeration e=new Employee_Registeration();
		e.setfName(reg.getfName());
		e.setlName(reg.getlName());
		e.setReportingManagerId(reg.getReportingManagerId());
		if(er.findByEmployementId(reg.getEmployementId())<1)
		{
			e.setEmployementId(reg.getEmployementId());
		}
		else
		{
			throw new EmployementIdAlreadyExistException();
		}
		e.setDesignation(reg.getDesignation());
		e.setDepartment(reg.getDepartment());
		e.setStatus(reg.getStatus());
		e.setGender(reg.getGender());
		e.setBloodGroup(reg.getBloodGroup());
		e.setAddress(reg.getAddress());
		e.setDob(reg.getDob());
		e.setStartDate(reg.getStartDate());
		e.setEndDate(reg.getEndDate());
		return er.save(e);
	}

	@Override
	public int isEmployeeExists(@Valid String fname, String lname, int employementid) 
	{
		return er.existsById(fname, lname, employementid);
	}

	@Override
	public String getEmployeeById(long id) 
	{
		if(er.getOne(id)!=null||er.existsById(id)==false)
		{
			return er.getOne(id).toString();
		}
		else
		{
			throw new EmployeeNotfoundException();
		}
		
	}

	@Override
	public Employee_Registeration update(@Valid Employee_Registeration reg, long id) 
	{
		if(er.getOne(id).getId()==id)
		{
			Employee_Registeration e=new Employee_Registeration();
			e.setfName(reg.getfName());
			e.setlName(reg.getlName());
			e.setReportingManagerId(reg.getReportingManagerId());
			if(er.findByEmployementId(reg.getEmployementId())<1)
			{
				e.setEmployementId(reg.getEmployementId());
			}
			else
			{
				throw new EmployementIdAlreadyExistException();
			}
			e.setDesignation(reg.getDesignation());
			e.setDepartment(reg.getDepartment());
			e.setStatus(reg.getStatus());
			e.setGender(reg.getGender());
			e.setBloodGroup(reg.getBloodGroup());
			e.setAddress(reg.getAddress());
			e.setDob(reg.getDob());
			e.setStartDate(reg.getStartDate());
			e.setEndDate(reg.getEndDate());
			return er.saveAndFlush(e);
		}
		else
		{
			throw new EmployeeNotfoundException();
		}
	}

	@Override
	public int deletebyemployementid(int employementid) 
	{
		return er.deletebyemployementid(employementid);
	}

}