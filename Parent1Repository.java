package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.Parent1;

@Repository

public interface Parent1Repository extends JpaRepository<Parent1, Integer> {

}
