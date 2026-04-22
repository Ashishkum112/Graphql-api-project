package com.graphql.learn.graphql_project.services;

import com.graphql.learn.graphql_project.entities.Book;

import java.util.List;

public interface BookService {
    Book create(Book book);

    List<Book> getAllBooks();

    Book get(int bookId);
}
