package com.staffing.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "status_staffing_tb")
public class StatusStaffing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Date dateStatusStaffing;

	@Enumerated(EnumType.STRING)
	private Type type;
	@ManyToOne
	@JoinColumn(name = "EMPLOYEE_ID")
	private Employee refEmployee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateStatusStaffing() {
		return dateStatusStaffing;
	}

	public void setDateStatusStaffing(Date dateStatusStaffing) {
		this.dateStatusStaffing = dateStatusStaffing;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Employee getRefEmployee() {
		return refEmployee;
	}

	public void setRefEmployee(Employee refEmployee) {
		this.refEmployee = refEmployee;
	}

}
