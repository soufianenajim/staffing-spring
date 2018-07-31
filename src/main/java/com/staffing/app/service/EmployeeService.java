package com.staffing.app.service;

import java.util.Date;
import java.util.List;

import com.staffing.app.dto.EmployeeDTO;

public interface EmployeeService {
	
	List<EmployeeDTO> findAllBetween(Date dateForm, Date dateTo);
	
	

}
