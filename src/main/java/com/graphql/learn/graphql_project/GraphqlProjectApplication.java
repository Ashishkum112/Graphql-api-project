package com.graphql.learn.graphql_project;

import com.graphql.learn.graphql_project.entities.Book;
import com.graphql.learn.graphql_project.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class GraphqlProjectApplication implements CommandLineRunner {


    private final BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Book b1 = new Book();
        b1.setTitle("Complete Reference");
        b1.setDesc("For Learning Java");
        b1.setPages(200);
        b1.setAuthor("Ashish");
        b1.setPrice(5000);

        Book b2 = new Book();
        b2.setTitle("Think Java");
        b2.setDesc("For Learning Java");
        b2.setPages(100);
        b2.setAuthor("Priya");
        b2.setPrice(50300);

        this.bookService.create(b1);
        this.bookService.create(b2);
    }
}
