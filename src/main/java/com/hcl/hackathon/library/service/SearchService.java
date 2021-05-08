package com.hcl.hackathon.library.service;

import com.hcl.hackathon.library.model.BookItem;

import java.util.List;

public interface SearchService {
    public List<BookItem> getBookByUUID(int uuid);
    public List<BookItem> getBookByTitle(String title);
    public List<BookItem> getBookByAuthor(String title);
    public List<BookItem> getBookByBookCategory(String title);

}
