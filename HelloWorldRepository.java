package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.HelloWorld;



@Repository
public interface HelloWorldRepository extends JpaRepository<HelloWorld, Integer> {

}
