package com.graphql.learn.graphql_project.controller;

import com.graphql.learn.graphql_project.entities.Book;
import com.graphql.learn.graphql_project.services.BookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;


    @MutationMapping("createBook")
    public Book createBook(@Argument BookInput book)
    {
        Book b=new Book();
        b.setTitle(book.getTitle());
        b.setDesc(book.getDesc());
        b.setPages(b.getPages());
        b.setPrice(book.getPrice());
        b.setAuthor(book.getAuthor());
        return this.bookService.create(b);
    }

    //getAll
    @QueryMapping("getAllBooks")
    public List<Book> getAllBooks(){
        return this.bookService.getAllBooks();
    }

    @QueryMapping("getBook")
    public Book getBook(@Argument int bookId){
        return this.bookService.get(bookId);
    }


}

@Getter
@Setter
class BookInput{
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;
}
