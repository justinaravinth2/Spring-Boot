package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatpoint.server.main.model.Students;

public interface StudentsRepository extends JpaRepository<Students, Integer>{
	

}