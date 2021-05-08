package com.hcl.hackathon.library.service;

import com.hcl.hackathon.library.model.BookItem;
import com.hcl.hackathon.library.repository.BooksInventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    BooksInventoryRepo booksInventoryRepo;

    @Override
    public List<BookItem> getBookByUUID(int uuid) {
        return booksInventoryRepo.findAllById(Collections.singleton(uuid));
    }

    @Override
    public List<BookItem> getBookByTitle(String title) {
        return null;
    }

    @Override
    public List<BookItem> getBookByAuthor(String title) {
        return null;
    }

    @Override
    public List<BookItem> getBookByBookCategory(String title) {
        return null;
    }

}