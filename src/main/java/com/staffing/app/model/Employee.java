package com.staffing.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee_tb")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToMany(mappedBy="refEmployee",fetch=FetchType.LAZY)
	private List<EmployeeProject> employeesProject;
	
	@OneToMany(mappedBy="refEmployee")
	private List<StatusStaffing> statusStaffings;

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

	public List<EmployeeProject> getEmployeesProject() {
		return employeesProject;
	}

	public void setEmployeesProject(List<EmployeeProject> employeesProject) {
		this.employeesProject = employeesProject;
	}

	public List<StatusStaffing> getStatusStaffings() {
		return statusStaffings;
	}

	public void setStatusStaffings(List<StatusStaffing> statusStaffings) {
		this.statusStaffings = statusStaffings;
	}

	
	
	
	

}
