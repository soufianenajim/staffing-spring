package com.staffing.app.dao;

import java.util.Date;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.staffing.app.model.EmployeeProject_;
import com.staffing.app.model.Employee_;
import com.staffing.app.model.Staffing;
import com.staffing.app.model.Staffing_;

public class StaffingSpecification {
	
	public static Specification<Staffing> idEqual(Long id){
		
		return (Root<Staffing> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> cb
				.equal(root.get(Staffing_.id), id);
		
	}
public static Specification<Staffing> EqualEmployee(Long idEmployee){
		
		return (Root<Staffing> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> cb
				.equal(root.get(Staffing_.refEmployeeProject).get(EmployeeProject_.refEmployee).get(Employee_.id),idEmployee);
		
	}

public static Specification<Staffing> betwen(Date date1,Date date2){
	
	return (Root<Staffing> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> cb
			.between(root.get(Staffing_.dateStaffing), date1, date2);
	
}
}
