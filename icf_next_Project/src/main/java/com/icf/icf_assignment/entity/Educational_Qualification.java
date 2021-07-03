package com.icf.icf_assignment.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//POJO class for Educational qualification
@Entity
@Table(name = "educational_qualification")
public class Educational_Qualification
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long eid;
	@Column(name = "coursetype" ,nullable = false,length = 20)
	private  String courseType;  // Checking for part time or full time
	@Temporal(TemporalType.DATE)
	@Column(name = "startdate" ,nullable = false)
	private Date startDate;
	@Temporal(TemporalType.DATE)
	@Column(name = "enddate" ,nullable = false)
	private Date endDate;
	@Column(name = "institutiontype" ,nullable = false,length = 20)
	private String institutionType;    // Checking for government or private
	@Column(name = "institution" ,nullable = false,length = 30)
	private String institution;
	@Column(name = "institutionAddress" ,nullable = false,length = 50)
	private String institutionAddress;
	@Column(name = "percentage" ,nullable = false)
	private int percentage;
	
	private long id;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@ManyToOne
		private Employee_Registeration employee_Registeration;
	
	public Employee_Registeration getEmployee_Registeration() {
		return employee_Registeration;
	}
	public void setEmployee_Registeration(Employee_Registeration employee_Registeration) {
		this.employee_Registeration = employee_Registeration;
	}
	
	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
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
	public String getInstitutionType() {
		return institutionType;
	}
	public void setInstitutionType(String institutionType) {
		this.institutionType = institutionType;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getInstitutionAddress() {
		return institutionAddress;
	}
	public void setInstitutionAddress(String institutionAddress) {
		this.institutionAddress = institutionAddress;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public Educational_Qualification(long eid, String courseType, Date startDate, Date endDate, String institutionType,
			String institution, String institutionAddress, int percentage) {
		super();
		this.eid = eid;
		this.courseType = courseType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.institutionType = institutionType;
		this.institution = institution;
		this.institutionAddress = institutionAddress;
		this.percentage = percentage;
	}
	public Educational_Qualification() {
		super();
	}
	@Override
	public String toString() {
		return "Educational_Qualification [eid=" + eid + ", courseType=" + courseType + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", institutionType=" + institutionType + ", institution=" + institution
				+ ", institutionAddress=" + institutionAddress + ", percentage=" + percentage + "]";
	}
	
}