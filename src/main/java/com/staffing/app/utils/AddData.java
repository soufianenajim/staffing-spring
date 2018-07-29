package com.staffing.app.utils;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.staffing.app.dao.EmployeeProjectRepository;
import com.staffing.app.dao.EmployeeRepository;
import com.staffing.app.dao.ProjectRepository;
import com.staffing.app.dao.StaffingRepository;
import com.staffing.app.model.Employee;
import com.staffing.app.model.EmployeeProject;
import com.staffing.app.model.Project;
import com.staffing.app.model.Staffing;

@Component
public class AddData implements ApplicationListener<ContextRefreshedEvent> {

	EmployeeRepository employeeRepository;
	EmployeeProjectRepository employeeProjectRepository;
	ProjectRepository projectRepository;
	StaffingRepository staffingRepository; 
	public AddData(EmployeeRepository employeeRepository, EmployeeProjectRepository employeeProjectRepository,
			ProjectRepository projectRepository,StaffingRepository staffingRepository ) {
		this.employeeRepository = employeeRepository;
		this.employeeProjectRepository = employeeProjectRepository;
		this.projectRepository = projectRepository;
		this.staffingRepository=staffingRepository; 
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		save();

	}

	public void save() {
		Employee emp1 = new Employee();
		emp1.setName("Hamza");
		Employee emp2 = new Employee();
		emp2.setName("Soufiane");
		Employee empSaved1 = employeeRepository.save(emp1);
		Employee empSaved2 = employeeRepository.save(emp2);
		
		Project p = new Project();
		p.setName("Victoria");
		Project pSaved = projectRepository.save(p);
		
		EmployeeProject empr1 = new EmployeeProject();
		empr1.setRefEmployee(empSaved1);
		empr1.setRefProject(pSaved);
		empr1.setDateFrom(new Date());
		empr1.setDateTo(new Date());
		employeeProjectRepository.save(empr1);
		EmployeeProject empr2 = new EmployeeProject();
		empr2.setRefEmployee(empSaved2);
		empr2.setRefProject(pSaved);
		empr2.setDateFrom(new Date());
		empr2.setDateTo(new Date());
		employeeProjectRepository.save(empr2);
		 Calendar c1 = Calendar.getInstance();
		 for(int i=0;i<60;i++){
			 c1.add(Calendar.DATE, 1);
		        Date d = c1.getTime(); 
			 Staffing staffing=new Staffing(); 
			 staffing.setDuration("8h");
			 staffing.setRefEmployeeProject(empr1);
			 staffing.setDateStaffing(d);
			 staffingRepository.save(staffing);
			 
		 }
		 Calendar c2 = Calendar.getInstance();
		 for(int i=0;i<60;i++){
			 c2.add(Calendar.DATE, 1);
		        Date d = c2.getTime(); 
			 Staffing staffing=new Staffing(); 
			 staffing.setDuration("8h");
			 staffing.setRefEmployeeProject(empr2);
			 staffing.setDateStaffing(d);
			 staffingRepository.save(staffing);
			 
		 }
	       

	}

}
