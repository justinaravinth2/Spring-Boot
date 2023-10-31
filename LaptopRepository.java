package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
