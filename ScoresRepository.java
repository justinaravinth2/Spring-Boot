package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatpoint.server.main.model.Scores;

public interface ScoresRepository extends JpaRepository<Scores, Integer> {

}
