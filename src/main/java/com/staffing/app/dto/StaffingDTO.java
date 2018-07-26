package com.staffing.app.dto;

import java.util.Date;

public class StaffingDTO {
	private Long id;

	private Date dateStaffing;

	private String duration;

	private EmployeeProjectDTO refEmployeeProject;

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

	public EmployeeProjectDTO getRefEmployeeProject() {
		return refEmployeeProject;
	}

	public void setRefEmployeeProject(EmployeeProjectDTO refEmployeeProject) {
		this.refEmployeeProject = refEmployeeProject;
	}

}
