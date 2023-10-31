package com.javatpoint.server.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.User1;

@Repository
public interface User1Repository extends JpaRepository<User1, Integer> {
	
	@Query(value="select jeni.nextval from dual",nativeQuery = true)
	int userid();

	User1 findOneByUnameIgnoreCaseOrEmailIgnoreCaseAndPassword(String uname, String email, String password);

	
	
	

	

	


	



	

	

	

}
