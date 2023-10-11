package com.dipali.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dipali.employee.entity.Employee;



@Repository
public interface EmpRepo  extends JpaRepository<Employee, Integer>{

}
