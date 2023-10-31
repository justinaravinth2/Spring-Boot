package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.PartyCurrency;

@Repository
public interface PartyCurrencyRepository extends JpaRepository<PartyCurrency, Integer>{

}
