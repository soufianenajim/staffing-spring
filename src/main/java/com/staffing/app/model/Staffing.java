package com.staffing.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "staffing_tb")
public class Staffing {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Date dateStaffing;

	private String duration;

	@ManyToOne
	@JoinColumn(name = "EMPLOYEEPROJECT_ID")
	private EmployeeProject refEmployeeProject;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateStaffing() {
		return dateStaffing;
	}

	public void setDateStaffing(Date dateStaffing) {
		this.dateStaffing = dateStaffing;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public EmployeeProject getRefEmployeeProject() {
		return refEmployeeProject;
	}

	public void setRefEmployeeProject(EmployeeProject refEmployeeProject) {
		this.refEmployeeProject = refEmployeeProject;
	}
	//

}
