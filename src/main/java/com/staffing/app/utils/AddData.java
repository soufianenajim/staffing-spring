package com.staffing.app.utils;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.staffing.app.dao.EmployeeProjectRepository;
import com.staffing.app.dao.EmployeeRepository;
import com.staffing.app.dao.ProjectRepository;
import com.staffing.app.dao.StaffingRepository;
import com.staffing.app.dao.StatusStaffingRepository;
import com.staffing.app.model.Employee;
import com.staffing.app.model.EmployeeProject;
import com.staffing.app.model.Project;
import com.staffing.app.model.Staffing;
import com.staffing.app.model.StatusStaffing;
import com.staffing.app.model.Type;

@Component
public class AddData implements ApplicationListener<ContextRefreshedEvent> {

	EmployeeRepository employeeRepository;
	EmployeeProjectRepository employeeProjectRepository;
	ProjectRepository projectRepository;
	StaffingRepository staffingRepository;
	StatusStaffingRepository statusStaffingRepository;
	

	public AddData(EmployeeRepository employeeRepository, EmployeeProjectRepository employeeProjectRepository,
			ProjectRepository projectRepository, StaffingRepository staffingRepository,
			StatusStaffingRepository statusStaffingRepository) {
		super();
		this.employeeRepository = employeeRepository;
		this.employeeProjectRepository = employeeProjectRepository;
		this.projectRepository = projectRepository;
		this.staffingRepository = staffingRepository;
		this.statusStaffingRepository = statusStaffingRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		save();

	}

	public void save() {
		
		
		Employee emp = new Employee();
		emp.setName("Hamza");
		emp.setLoc("SALE");
		emp.setTech("SI");
		Employee empSaved = employeeRepository.save(emp);
		
		StatusStaffing ss = new StatusStaffing();
		ss.setRefEmployee(empSaved);
		ss.setType(Type.DONE);
		ss.setDateStatusStaffing(new Date());
		statusStaffingRepository.save(ss);
		
		Project p = new Project();
		p.setName("Victoria");
		Project pSaved = projectRepository.save(p);
		
		EmployeeProject empr = new EmployeeProject();
		empr.setRefEmployee(empSaved);
		empr.setRefProject(pSaved);
		empr.setDateFrom(new Date());
		empr.setDateTo(new Date());
		
		Staffing s = new Staffing();
		s.setDateStaffing(new Date());
		s.setDuration("1d");
		s.setRefEmployeeProject(employeeProjectRepository.save(empr));
		staffingRepository.save(s);
	}

}
