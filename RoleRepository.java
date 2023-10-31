package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.server.main.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
