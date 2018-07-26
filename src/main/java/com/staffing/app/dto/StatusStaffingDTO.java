package com.staffing.app.dto;

import java.util.Date;

import com.staffing.app.model.Type;

public class StatusStaffingDTO {

	private Long id;

	private Date dateStatusStaffing;

	private Type type;

	private EmployeeDTO refEmployee;

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

	public EmployeeDTO getRefEmployee() {
		return refEmployee;
	}

	public void setRefEmployee(EmployeeDTO refEmployee) {
		this.refEmployee = refEmployee;
	}

}
