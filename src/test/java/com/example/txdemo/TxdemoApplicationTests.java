package com.example.txdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
class TxdemoApplicationTests {
    @Autowired
    BookRepository bookRepository;

    @Test
    @Transactional
    void contextLoads1() {
        System.out.println("contextLoads1");
        List<Book> allBooks = bookRepository.findAll();
        System.out.println(allBooks.size());
        Book book = new Book();
        book.setTitle("ciao1");
        bookRepository.save(book);
        allBooks = bookRepository.findAll();
        System.out.println(allBooks.size());
    }

    @Test
    @Transactional
    void contextLoads2() {
        System.out.println("contextLoads2");
        List<Book> allBooks = bookRepository.findAll();
        System.out.println(allBooks.size());
        Book book = new Book();
        book.setTitle("ciao2");
        bookRepository.save(book);
        allBooks = bookRepository.findAll();
        System.out.println(allBooks.size());

    }

    @Test
    @Transactional
    void contextLoads3() {
        System.out.println("contextLoads3");
        List<Book> allBooks = bookRepository.findAll();
        System.out.println(allBooks.size());
    }

}
