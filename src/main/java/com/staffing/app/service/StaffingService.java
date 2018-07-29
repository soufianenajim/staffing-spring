package com.staffing.app.service;

import java.util.Date;
import java.util.List;

import com.staffing.app.dto.StaffingDTO;

public interface StaffingService {
	List<StaffingDTO> getStaffingbetweenTOdate(Date date1,Date date2);
}
