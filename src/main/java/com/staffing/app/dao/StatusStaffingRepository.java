package com.staffing.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.staffing.app.model.StatusStaffing;

public interface StatusStaffingRepository extends JpaRepository<StatusStaffing, Long>,JpaSpecificationExecutor<StatusStaffing> {

}
