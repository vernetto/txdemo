package com.example.txdemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Slf4j
class TxdemoApplicationTests {
    @Autowired
    BookRepository bookRepository;

    @Test
    @Transactional
    void contextLoads1() {
        System.out.println("contextLoads1");
        List<Book> allBooks = bookRepository.findAll();
        log.info("size=" + allBooks.size());
        Book book = new Book();
        book.setTitle("ciao1");
        bookRepository.save(book);
        allBooks = bookRepository.findAll();
        log.info("size=" + allBooks.size());
    }

    @Test
    @Transactional
    void contextLoads2() {
        log.info("contextLoads2");
        List<Book> allBooks = bookRepository.findAll();
        log.info("size=" + allBooks.size());
        Book book = new Book();
        book.setTitle("ciao2");
        bookRepository.save(book);
        allBooks = bookRepository.findAll();
        log.info("size=" + allBooks.size());
    }

    @Test
    @Transactional
    void contextLoads3() {
        log.info("contextLoads3");
        List<Book> allBooks = bookRepository.findAll();
        log.info("size=" + allBooks.size());
    }

}
