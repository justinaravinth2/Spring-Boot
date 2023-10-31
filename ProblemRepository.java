package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.Problem;

@Repository
public interface ProblemRepository extends JpaRepository<Problem, Integer>{
	
	@Query(value="select lpad(p_seq5.nextval,2,1) from dual",nativeQuery = true)
	int probid();

}
