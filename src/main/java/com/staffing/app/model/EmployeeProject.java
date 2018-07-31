package com.staffing.app.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "employee_project_tb")
public class EmployeeProject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Temporal(TemporalType.DATE)
	private Date  dateFrom;

	@Temporal(TemporalType.DATE)
	private Date  dateTo;

	@ManyToOne
	@JoinColumn(name = "EMPLOYEE_ID")
	private Employee refEmployee;

	@ManyToOne
	@JoinColumn(name = "PROJECT_ID")
	private Project refProject;

	@OneToMany(mappedBy = "refEmployeeProject")
	private List<Staffing> staffings;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Employee getRefEmployee() {
		return refEmployee;
	}

	public Date  getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date  dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date  dateTo) {
		this.dateTo = dateTo;
	}

	public void setRefEmployee(Employee refEmployee) {
		this.refEmployee = refEmployee;
	}

	public Project getRefProject() {
		return refProject;
	}

	public void setRefProject(Project refProject) {
		this.refProject = refProject;
	}

	public List<Staffing> getStaffings() {
		return staffings;
	}

	public void setStaffings(List<Staffing> staffings) {
		this.staffings = staffings;
	}

}
