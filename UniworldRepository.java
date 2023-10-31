package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.Uniworld;

@Repository
public interface UniworldRepository extends JpaRepository<Uniworld, Integer> {
	
	@Query(value="select lpad(uniworld_seq1.nextval,4,0) from dual",nativeQuery = true)
	int unit();

}
