package com.graphql.learn.graphql_project.repository;

import com.graphql.learn.graphql_project.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {


}
