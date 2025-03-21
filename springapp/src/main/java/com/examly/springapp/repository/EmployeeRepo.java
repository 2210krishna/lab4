package com.examly.springapp.repository;

import com.examly.springapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    List<Employee> findByHireDate(Date hireDate);
}