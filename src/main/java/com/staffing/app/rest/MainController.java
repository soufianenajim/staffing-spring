package com.staffing.app.rest;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.staffing.app.dto.EmployeeDTO;
import com.staffing.app.model.Staffing;
import com.staffing.app.service.EmployeeService;
import com.staffing.app.service.StaffingService;

@RestController
public class MainController {

	@Autowired
	EmployeeService employeeService;
	
	@Autowired 
	StaffingService staffingService;

	@RequestMapping("/getDataBetween")
	public String getDataBetween(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate) {
        
		return "getDataBetween";
	}

	@RequestMapping("/findAll")
	public List<EmployeeDTO> findAll() {
		return employeeService.findAll();
	}
	@RequestMapping("/getData")
	 public List<Staffing> findBetwen() {
		 Calendar c = Calendar.getInstance();
		 
        Date date1=c.getTime() ;
        c.add(Calendar.DATE, 30);
        Date date2=c.getTime(); 
        		return staffingService.getStaffingbetweenTOdate(date1, date2) ;
    }
	

}
