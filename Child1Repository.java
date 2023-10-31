package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.Child1;

@Repository
public interface Child1Repository extends JpaRepository<Child1, Integer> {

}
