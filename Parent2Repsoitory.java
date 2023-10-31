package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.Parent2;

@Repository

public interface Parent2Repsoitory extends JpaRepository<Parent2, Integer> {

}
