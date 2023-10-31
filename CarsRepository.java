package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.Cars;

@Repository
public interface CarsRepository extends JpaRepository<Cars, Integer> {
	
	@Query(value = "select crs.nextval from dual",nativeQuery = true)
	int c_no();

}
