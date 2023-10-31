package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatpoint.server.main.model.Can;

public interface CanRepository extends JpaRepository<Can, Integer>{

}
