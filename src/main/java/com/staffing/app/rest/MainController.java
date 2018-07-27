package com.staffing.app.rest;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/getDataBetween")
	public String getDataBetween(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate) {

		return "getDataBetween";
	}
	
}
