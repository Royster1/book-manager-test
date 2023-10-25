package com.example.service;

import com.example.entity.Book;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    void insertBook(Book book);

}
