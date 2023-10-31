package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatpoint.server.main.model.Boys;

public interface BoysRepository extends JpaRepository<Boys, Integer> {

}
