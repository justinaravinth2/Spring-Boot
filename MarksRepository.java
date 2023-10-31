package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatpoint.server.main.model.Marks;

public interface MarksRepository extends JpaRepository<Marks, Integer>{

}
