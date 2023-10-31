package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.Child2;
@Repository

public interface Child2Repository extends JpaRepository<Child2,Integer> {

}
