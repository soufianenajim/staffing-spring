package com.staffing.app.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.staffing.app.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>, JpaSpecificationExecutor<Employee> {

	@Query(value="SELECT * FROM EMPLOYEE_TB JOIN EMPLOYEE_PROJECT_TB ON EMPLOYEE_TB.ID = EMPLOYEE_PROJECT_TB.EMPLOYEE_ID"
			+ " WHERE EMPLOYEE_PROJECT_TB.DATE_TO BETWEEN ?1 AND ?2" , nativeQuery = true)
	public List<Employee> findAllBetween(Date dateFrom,Date dateTo);
}
