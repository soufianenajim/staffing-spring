package com.staffing.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staffing.app.dao.EmployeeRepository;
import com.staffing.app.dto.EmployeeDTO;
import com.staffing.app.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	Mapper mapper;

	@Override
	public List<EmployeeDTO> findAll() {
		// TODO Auto-generated method stub
		List<Employee> employeeList = employeeRepository.findAll();
		return employeeList
		.stream()
		.map(employee -> mapper.map(employee,EmployeeDTO.class,"EMPLOYEE_MAPPING"))
		.collect(Collectors.toList());
	
	}

}
