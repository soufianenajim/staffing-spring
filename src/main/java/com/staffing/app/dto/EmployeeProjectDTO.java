package com.staffing.app.dto;

import java.util.Date;
import java.util.List;

public class EmployeeProjectDTO {

	private Long id;

	private Date  dateFrom;

	private Date  dateTo;

	private EmployeeDTO refEmployee;

	private ProjectDTO refProject;

	private List<StaffingDTO> staffings;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date  getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date  dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date  getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date  dateTo) {
		this.dateTo = dateTo;
	}

	public EmployeeDTO getRefEmployee() {
		return refEmployee;
	}

	public void setRefEmployee(EmployeeDTO refEmployee) {
		this.refEmployee = refEmployee;
	}

	public ProjectDTO getRefProject() {
		return refProject;
	}

	public void setRefProject(ProjectDTO refProject) {
		this.refProject = refProject;
	}

	public List<StaffingDTO> getStaffings() {
		return staffings;
	}

	public void setStaffings(List<StaffingDTO> staffings) {
		this.staffings = staffings;
	}

}
