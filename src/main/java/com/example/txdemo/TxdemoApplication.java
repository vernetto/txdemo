package com.example.txdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TxdemoApplication implements CommandLineRunner {
    @Autowired
    BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(TxdemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Book book = new Book();
        book.setTitle("ciao");
        bookService.save(book);
                
    }
}
