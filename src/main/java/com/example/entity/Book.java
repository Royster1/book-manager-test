package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    String bookname;
    double bookprice;
    int booknum;

    public double sum(){
        return this.bookprice * this.getBooknum();
    }
}
