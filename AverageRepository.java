package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.Average;

@Repository

public interface AverageRepository extends JpaRepository<Average, Integer>{
	
	
	@Query(value="select avg_seq.nextval from dual",nativeQuery = true)
	int avgid();
	
//	@Query(value="update average_table a set total=(a.tamil+a.english+a.maths+a.science+a.social)",nativeQuery = true)
//	int tot();
	
	@Query(value="update average_table a set average=(a.total/5)",nativeQuery = true)
	double avvg();
	
}
