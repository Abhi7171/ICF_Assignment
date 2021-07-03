package com.icf.icf_assignment.request;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class DependentsRequest 
{
	@NotEmpty(message = "first name cant be null")
	@NotBlank(message = "first name cant be empty")
	private String firstName;
	@NotEmpty(message = "last name cant be null")
	@NotBlank(message = "last name cant be empty")
	private String lastName;
	@NotEmpty(message = "gender cant be null")
	@NotBlank(message = "gender cant be empty")
	private String gender;
	@NotEmpty(message = "relationship cant be null")
	@NotBlank(message = "relationship cant be empty")
	private String relationship;
	@Temporal(TemporalType.DATE)
	private Date dob;
	
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
	public DependentsRequest(
			@NotEmpty(message = "first name cant be null") @NotEmpty(message = "first name cant be empty") String firstName,
			@NotEmpty(message = "last name cant be null") @NotEmpty(message = "last name cant be empty") String lastName,
			@NotEmpty(message = "gender cant be null") @NotEmpty(message = "gender cant be empty") String gender,
			@NotEmpty(message = "relationship cant be null") @NotEmpty(message = "relationship cant be empty") String relationship,
			Date dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.relationship = relationship;
		this.dob = dob;
	}
	public DependentsRequest() {
		super();
	}
	@Override
	public String toString() {
		return "DependentsRequest [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", relationship=" + relationship + ", dob=" + dob + "]";
	}
	
}