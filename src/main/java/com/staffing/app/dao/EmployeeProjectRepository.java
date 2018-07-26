package com.staffing.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.staffing.app.model.EmployeeProject;

public interface EmployeeProjectRepository extends JpaRepository<EmployeeProject, Long>,JpaSpecificationExecutor<EmployeeProject> {

}
