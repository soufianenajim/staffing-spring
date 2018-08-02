package com.staffing.app.dto;

import java.util.List;

public class EmployeeDTO {

	private Long id;

	private String name;
	private String loc;
	private String tech;
	
	private List<EmployeeProjectDTO> employeesProject;

	private List<StatusStaffingDTO> statusStaffings;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<EmployeeProjectDTO> getEmployeesProject() {
		return employeesProject;
	}

	public void setEmployeesProject(List<EmployeeProjectDTO> employeesProject) {
		this.employeesProject = employeesProject;
	}

	public List<StatusStaffingDTO> getStatusStaffings() {
		return statusStaffings;
	}

	public void setStatusStaffings(List<StatusStaffingDTO> statusStaffings) {
		this.statusStaffings = statusStaffings;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	
}
