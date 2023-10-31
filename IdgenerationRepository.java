package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.Idgeneration;

@Repository
public interface IdgenerationRepository extends JpaRepository<Idgeneration, Integer>{
	
	@Query(value="select SEQ_post.nextval from dual",nativeQuery = true)
	int seq_generator();

}
