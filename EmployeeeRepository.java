package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatpoint.server.main.model.Employeee;

public interface EmployeeeRepository extends JpaRepository<Employeee, Integer>{

}
