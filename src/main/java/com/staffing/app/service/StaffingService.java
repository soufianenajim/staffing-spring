package com.staffing.app.service;

import java.util.Date;
import java.util.List;

import com.staffing.app.model.Staffing;

public interface StaffingService {
	List<Staffing> getStaffingbetweenTOdate(Date date1,Date date2);
}
