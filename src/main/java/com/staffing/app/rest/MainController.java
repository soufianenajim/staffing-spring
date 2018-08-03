package com.staffing.app.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.staffing.app.dao.StaffingRepository;
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
	public List<EmployeeDTO> getDataBetween(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate) {

		System.out.println("from " + fromDate + " to " + toDate);
		return employeeService.findAllBetween(fromDate, toDate);
	}


	@PostMapping("/updateStaffing")
	public void updateStaffing(@RequestBody Staffing data,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {

		staffingService.update(data, date);
	}

}
