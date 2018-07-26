package com.staffing.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.staffing.app.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>,JpaSpecificationExecutor<Project> {

}
