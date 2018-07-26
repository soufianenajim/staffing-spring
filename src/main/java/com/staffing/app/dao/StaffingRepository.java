package com.staffing.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.staffing.app.model.Staffing;

public interface StaffingRepository extends JpaRepository<Staffing, Long>,JpaSpecificationExecutor<Staffing> {

}
