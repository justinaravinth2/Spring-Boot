package com.javatpoint.server.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatpoint.server.main.model.Books;

public interface BooksRepository extends JpaRepository<Books, Integer>{

}
