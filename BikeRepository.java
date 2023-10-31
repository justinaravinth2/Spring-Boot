package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.Bike;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer> {
	
	@Query(value = "select bike_seq.nextval from dual",nativeQuery = true)
	int bikes();

}
