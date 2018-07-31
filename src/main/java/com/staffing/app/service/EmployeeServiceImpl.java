package com.staffing.app.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staffing.app.dao.EmployeeRepository;
import com.staffing.app.dto.EmployeeDTO;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	Mapper mapper;

	@Override
	public List<EmployeeDTO> findAllBetween(Date dateFrom, Date dateTo) {

		return employeeRepository.findAllBetween(dateFrom, dateTo).stream()
				.map(employee -> mapper.map(employee, EmployeeDTO.class, "EMPLOYEE_MAPPING"))
				.collect(Collectors.toList());

	}

	public boolean isBetween(Date dateFrom, Date dateToProject, Date dateTo) {
		return !dateFrom.after(dateToProject) && !dateToProject.after(dateTo);
	}

}
