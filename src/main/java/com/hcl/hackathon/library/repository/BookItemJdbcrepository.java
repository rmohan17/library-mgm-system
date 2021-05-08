package com.hcl.hackathon.library.repository;

import com.hcl.hackathon.library.model.BookItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class BookItemJdbcrepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public BookItem getBookByUUID(long id) {
        return (BookItem) jdbcTemplate.queryForObject("select * from BOOK_ITEM where UUID =?", new Object[]{
                        id
                },
                new BeanPropertyRowMapper<BookItem>(BookItem.class));
    }


    public BookItem getBookByTitle(String title) {
        return (BookItem) jdbcTemplate.queryForObject("select * from BOOK_ITEM where TITLE =?", new Object[]{
                        title
                },
                new BeanPropertyRowMapper<BookItem>(BookItem.class));
    }

    public BookItem getBookByAuthor(String author) {
        return (BookItem) jdbcTemplate.queryForObject("select * from BOOK_ITEM where AUTHOR   =?", new Object[]{
                        author
                },
                new BeanPropertyRowMapper<BookItem>(BookItem.class));
    }

    public BookItem getBookByBookCategory(String category) {
        return (BookItem) jdbcTemplate.queryForObject("select * from BOOK_ITEM where BOOK_CATEGORY =?", new Object[]{
                        category
                },
                new BeanPropertyRowMapper<BookItem>(BookItem.class));
    }
}

