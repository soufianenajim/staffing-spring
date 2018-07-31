package com.staffing.app.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staffing.app.dao.EmployeeRepository;
import com.staffing.app.dto.EmployeeDTO;
import com.staffing.app.model.Employee;
import com.staffing.app.model.Project;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	Mapper mapper;

	@Override
	public List<EmployeeDTO> findAllBetween(Date dateFrom, Date dateTo) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = employeeRepository.findAll();
		List<EmployeeDTO> employeeDTOList = employeeList.stream()
				.map(employee -> mapper.map(employee, EmployeeDTO.class, "EMPLOYEE_MAPPING"))
				.collect(Collectors.toList());

		employeeDTOList.forEach(employeeDTO -> {
			employeeDTO.getEmployeesProject().removeIf(project -> !isBetween(dateFrom, project.getDateTo(), dateTo));
		});

		return employeeDTOList;

	}

	public boolean isBetween(Date dateFrom, Date dateToProject, Date dateTo) {
		System.out.println(dateFrom);
		System.out.println(dateToProject);
		System.out.println(dateTo);
		System.out.println(!dateFrom.after(dateToProject) && !dateToProject.after(dateTo));
		return !dateFrom.after(dateToProject) && !dateToProject.after(dateTo);
	}

}
