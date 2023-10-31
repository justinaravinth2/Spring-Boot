package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.Rat;

@Repository
public interface RatRepository extends JpaRepository<Rat, Integer> {

	@Query(value="select se1.nextval from dual",nativeQuery = true)
	int seq();

}
