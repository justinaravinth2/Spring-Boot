package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.Stringkey;

@Repository
public interface StringkeyRepository extends JpaRepository<Stringkey, Integer> {

	
	@Query(value="select uniworld_seq.nextval from dual",nativeQuery = true)
	int s_no();
	
	@Query("from Stringkey s where s.s_id=:s_id")
	public Stringkey getByS_id(String s_id);
}
