package com.staffing.app.rest;

import java.util.Date;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.staffing.app.dto.EmployeeDTO;
import com.staffing.app.service.EmployeeService;

@RestController
public class MainController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/getDataBetween")
	public List<EmployeeDTO> getDataBetween(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate) {

		System.out.println("from "+fromDate+" to "+toDate);
		return employeeService.findAllBetween(fromDate, toDate);
	}

}
