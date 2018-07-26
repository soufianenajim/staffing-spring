package com.staffing.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.staffing.app.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>,JpaSpecificationExecutor<Employee> {

}
