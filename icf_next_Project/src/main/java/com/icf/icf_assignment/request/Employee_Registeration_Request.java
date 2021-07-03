package com.icf.icf_assignment.request;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Employee_Registeration_Request 
{
	@NotNull
	private int employementId;
	@NotNull
	private int reportingManagerId;
	@NotEmpty(message = "first name cant be null")
	@NotBlank(message = "first name cant be empty")
	private String fName;
	@NotEmpty(message = "last name cant be null")
	@NotBlank(message = "last name cant be empty")
	private String lName;
	@NotEmpty(message = "designation cant be null")
	@NotBlank(message = "designation cant be empty")
	private String designation;
	@NotEmpty(message = "department cant be null")
	@NotBlank(message = "department cant be empty")
	private String department;
	@NotEmpty(message = "status cant be null")
	@NotBlank(message = "status cant be empty")
	private String status;
	@NotEmpty(message = "gender cant be null")
	@NotBlank(message = "gender cant be empty")
	private String gender;
	@NotEmpty(message = "bloodGroup cant be null")
	@NotBlank(message = "bloodGroup cant be empty")
	private String bloodGroup;
	@NotEmpty(message = "address cant be null")
	@NotBlank(message = "address cant be empty")
	private String address;
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	public int getEmployementId() {
		return employementId;
	}
	public void setEmployementId(int employementId) {
		this.employementId = employementId;
	}
	public int getReportingManagerId() {
		return reportingManagerId;
	}
	public void setReportingManagerId(int reportingManagerId) {
		this.reportingManagerId = reportingManagerId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Employee_Registeration_Request(
			@NotEmpty(message = "employementId cant be null") @NotEmpty(message = "employementId cant be empty") int employementId,
			@NotEmpty(message = "reportingManagerId cant be null") @NotEmpty(message = "reportingManagerId cant be empty") int reportingManagerId,
			@NotEmpty(message = "first name cant be null") @NotEmpty(message = "first name cant be empty") String fName,
			@NotEmpty(message = "last name cant be null") @NotEmpty(message = "last name cant be empty") String lName,
			@NotEmpty(message = "designation cant be null") @NotEmpty(message = "designation cant be empty") String designation,
			@NotEmpty(message = "department cant be null") @NotEmpty(message = "department cant be empty") String department,
			@NotEmpty(message = "status cant be null") @NotEmpty(message = "status cant be empty") String status,
			@NotEmpty(message = "gender cant be null") @NotEmpty(message = "gender cant be empty") String gender,
			@NotEmpty(message = "bloodGroup cant be null") @NotEmpty(message = "bloodGroup cant be empty") String bloodGroup,
			@NotEmpty(message = "address cant be null") @NotEmpty(message = "address cant be empty") String address,
			@NotEmpty(message = "dob cant be null") @NotEmpty(message = "dob cant be empty") Date dob,
			@NotEmpty(message = "StartDate cant be null") @NotEmpty(message = "StartDate cant be empty") Date startDate,
			@NotEmpty(message = "EndDate cant be null") @NotEmpty(message = "EndDate cant be empty") Date endDate) {
		super();
		this.employementId = employementId;
		this.reportingManagerId = reportingManagerId;
		this.fName = fName;
		this.lName = lName;
		this.designation = designation;
		this.department = department;
		this.status = status;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.address = address;
		this.dob = dob;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public Employee_Registeration_Request() {
		super();
	}
	@Override
	public String toString() {
		return "Employee_Registeration_Request [employementId=" + employementId + ", reportingManagerId="
				+ reportingManagerId + ", fName=" + fName + ", lName=" + lName + ", designation=" + designation
				+ ", department=" + department + ", status=" + status + ", gender=" + gender + ", bloodGroup="
				+ bloodGroup + ", address=" + address + ", dob=" + dob + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}
	
	
}