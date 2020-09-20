package com.example.txdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    @Transactional
    public void save(Book book) {
        bookRepository.save(book);
    }
}
