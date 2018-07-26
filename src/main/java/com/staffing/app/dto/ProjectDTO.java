package com.staffing.app.dto;

import java.util.List;

public class ProjectDTO {

	private Long id;
	private String name;

	private List<EmployeeProjectDTO> employeesProject;

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

}
