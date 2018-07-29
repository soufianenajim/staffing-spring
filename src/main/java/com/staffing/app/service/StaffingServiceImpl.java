package com.staffing.app.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.staffing.app.dao.StaffingRepository;
import com.staffing.app.dao.StaffingSpecification;
import com.staffing.app.dto.StaffingDTO;
import com.staffing.app.model.Staffing;

@Service
public class StaffingServiceImpl implements StaffingService {

	@Autowired
	private StaffingRepository staffingRepository; 
	
	
	@Autowired
	Mapper mapper;
	@Override
	public List<Staffing>getStaffingbetweenTOdate(Date date1, Date date2) {
		
	//	return staffingRepository.findAll(Specification.where(StaffingSpecification.lessThan(date2).and(StaffingSpecification.biggerThan(date1))));
		List<Staffing> staffings=staffingRepository.findAll(Specification.where(StaffingSpecification.betwen(date1, date2).and(StaffingSpecification.EqualEmployee(2L))));
		//List<Staffing> staffings=staffingRepository.findAll();
		//return staffings.stream().map(s->mapper.map(s, StaffingDTO.class,"MAPPING_STAFFING")).collect(Collectors.toList());
		//return staffingRepository.findAll();
		return staffings;
	}
}
