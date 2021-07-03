package com.icf.icf_assignment.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//Pojo for dependents and validation
@Entity
@Table(name = "dependents",indexes = @Index(name="dependents_index",columnList = "dependentid"))
public class Dependents 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long dependentid;
	@Column(name = "firstname", nullable = false, length = 15)
	private String firstName;
	@Column(name = "lastname", nullable = false, length = 15)
	private String lastName;
	@Column(name = "gender", nullable = false, length = 1)
	private String gender;
	@Column(name = "relationship", nullable = false, length = 15)
	private String relationship;
	@Column(name = "dob", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@ManyToOne
	@JoinColumn(name = "eid")
	private Employee_Registeration employee_Registeration;
	
	public Employee_Registeration getEmployee_Registeration() {
		return employee_Registeration;
	}
	public void setEmployee_Registeration(Employee_Registeration employee_Registeration) {
		this.employee_Registeration = employee_Registeration;
	}
	
	public long getDependentid() {
		return dependentid;
	}
	public void setDependentid(long dependentid) {
		this.dependentid = dependentid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Dependents(long dependentid, String firstName, String lastName, String gender, String relationship,
			Date dob) {
		super();
		this.dependentid = dependentid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.relationship = relationship;
		this.dob = dob;
	}
	public Dependents() {
		super();
	}
	@Override
	public String toString() {
		return "Dependents [dependentid=" + dependentid + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", gender=" + gender + ", relationship=" + relationship + ", dob=" + dob + "]";
	}

}