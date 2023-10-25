package com.example;


import com.example.dao.BookMapper;
import com.example.entity.Book;
import com.example.service.BookService;
import com.example.service.impl.BookServiceImpl;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        try (SqlSession sqlSession = SqlsessionFactory.getSession(true)){
//            BookMapper bookDao = sqlSession.getMapper(BookMapper.class);
//            List<Book> books = bookDao.findAll();
//            System.out.println(books);
//        }

        BookService service;
        service = new BookServiceImpl();
        System.out.println(service.findAll());

        // service.insertBook(new Book("gg", 1, 2));
    }
}
