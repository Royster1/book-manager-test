package com.example.service.impl;


import com.example.dao.BookMapper;
import com.example.entity.Book;
import com.example.service.BookService;
import com.example.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BookServiceImpl implements BookService {
    @Override
    public List<Book> findAll() {
        try (SqlSession sqlSession = MybatisUtil.getSession()){
            BookMapper mapper = sqlSession.getMapper(BookMapper.class);
            mapper.findAll();
            return mapper.findAll();
        }
    }

    @Override
    public void insertBook(Book book) {
        try (SqlSession sqlSession = MybatisUtil.getSession()){
            BookMapper mapper = sqlSession.getMapper(BookMapper.class);
            mapper.insertBook(book);
        }
    }
}
