package com.staffing.app.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staffing.app.dao.StaffingRepository;
import com.staffing.app.model.Staffing;

@Service
public class StaffingServiceImpl implements StaffingService {

	@Autowired
	StaffingRepository staffingRepository;
	
	@Override
	public void update(Staffing staffing, Date date) {
		Optional<Staffing> sOpt = staffingRepository.findById(staffing.getId());
		if(sOpt.isPresent()) {
			Staffing s = sOpt.get();
			s.setDateStaffing(date);
			staffingRepository.save(s);
		}
			
	}

}
