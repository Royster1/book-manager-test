package com.example.dao;

import com.example.entity.Book;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface BookMapper {

    @Insert("insert into book values(null,#{bookname},#{bookprice},#{booknum})")
    void insertBook(Book book);
    List<Book> findAll();

}
