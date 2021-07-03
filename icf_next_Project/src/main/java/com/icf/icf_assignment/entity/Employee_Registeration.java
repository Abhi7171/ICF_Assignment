package com.icf.icf_assignment.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//POJO class for Employee with validation

@Entity
@Table(name = "employee_registeration",indexes = @Index(name="employee_index",columnList = "employementId"))
public class Employee_Registeration 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eid")
	private long id;
	@Column(name = "employementid",length = 20,nullable = false)
	private int employementId;
	@Column(name = "reportingmanagerid",length = 20,nullable = false)
	private int reportingManagerId;
	@Column(name = "fname",length = 15 ,nullable = false)
	private String fName;
	@Column(name = "lname",length = 15 ,nullable = false)
	private String lName;
	@Column(name = "designation",length = 25,nullable = false)
	private String designation;
	@Column(name = "department",length = 25 ,nullable = false)
	private String department;
	@Column(name = "status",length = 15 ,nullable = false)
	private String status;
	@Column(name = "gender",length = 1,nullable = false)
	private String gender;
	@Column(name = "bloodgroup",length = 2 ,nullable = false)
	private String bloodGroup;
	@Column(name = "address",length = 50 ,nullable = false)
	private String address;
	@Temporal(TemporalType.DATE)
	@Column(name = "dob",nullable = false)
	private Date dob;
	@Temporal(TemporalType.DATE)
	@Column(name = "startdate",nullable = false)
	private Date startDate;
	@Temporal(TemporalType.DATE)
	@Column(name = "enddate",nullable = false)
	private Date endDate;
	
	@OneToMany(mappedBy = "employee_Registeration",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Dependents> dependents = new ArrayList<>();
	
	@OneToMany(mappedBy = "employee_Registeration",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Educational_Qualification> educational_Qualifications = new ArrayList<>();
	
	public List<Dependents> getDependents() {
		return dependents;
	}
	public void setDependents(List<Dependents> dependents) {
		this.dependents = dependents;
	}
	public List<Educational_Qualification> getEducational_Qualifications() {
		return educational_Qualifications;
	}
	public void setEducational_Qualifications(List<Educational_Qualification> educational_Qualifications) {
		this.educational_Qualifications = educational_Qualifications;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public Employee_Registeration(long id, int employementId, int reportingManagerId, String fName, String lName,
			String designation, String department, String status, String gender, String bloodGroup, String address,
			Date dob, Date startDate, Date endDate) {
		super();
		this.id = id;
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
	public Employee_Registeration() {
		super();
	}
	@Override
	public String toString() {
		return "Employee_Registeration [id=" + id + ", employementId=" + employementId + ", reportingManagerId="
				+ reportingManagerId + ", fName=" + fName + ", lName=" + lName + ", designation=" + designation
				+ ", department=" + department + ", status=" + status + ", gender=" + gender + ", bloodGroup="
				+ bloodGroup + ", address=" + address + ", dob=" + dob + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}		
}