package com.staffing.app.utils;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.staffing.app.dao.EmployeeProjectRepository;
import com.staffing.app.dao.EmployeeRepository;
import com.staffing.app.dao.ProjectRepository;
import com.staffing.app.model.Employee;
import com.staffing.app.model.EmployeeProject;
import com.staffing.app.model.Project;

@Component
public class AddData implements ApplicationListener<ContextRefreshedEvent> {

	EmployeeRepository employeeRepository;
	EmployeeProjectRepository employeeProjectRepository;
	ProjectRepository projectRepository;

	public AddData(EmployeeRepository employeeRepository, EmployeeProjectRepository employeeProjectRepository,
			ProjectRepository projectRepository) {
		this.employeeRepository = employeeRepository;
		this.employeeProjectRepository = employeeProjectRepository;
		this.projectRepository = projectRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		save();

	}

	public void save() {
		Employee emp = new Employee();
		emp.setName("Hamza");
		Employee empSaved = employeeRepository.save(emp);
		
		
		Project p = new Project();
		p.setName("Victoria");
		Project pSaved = projectRepository.save(p);
		EmployeeProject empr = new EmployeeProject();
		empr.setRefEmployee(empSaved);
		empr.setRefProject(pSaved);
		empr.setDateFrom(new Date());
		empr.setDateTo(new Date());
		employeeProjectRepository.save(empr);

	}

}
