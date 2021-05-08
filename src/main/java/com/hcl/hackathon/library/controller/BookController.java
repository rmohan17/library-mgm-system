package com.hcl.hackathon.library.controller;

import com.hcl.hackathon.library.model.BookItem;
import com.hcl.hackathon.library.repository.BookItemJdbcrepository;
import com.hcl.hackathon.library.repository.BooksInventoryRepo;
import com.hcl.hackathon.library.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libraryMgmSystem")
public class BookController {

    @Autowired
    private BooksInventoryRepo booksInventoryRepo;

    @Autowired
    private BookItemJdbcrepository bookItemJdbcrepository;

    @Autowired
    private SearchService searchService;

    @PostMapping(path = "/", produces = "application/json")
    public ResponseEntity<BookItem> addBookItem(@RequestBody BookItem bookItem) {
        try {
            BookItem bookItemSaved = booksInventoryRepo.save(bookItem);
            return new ResponseEntity<>(bookItemSaved, HttpStatus.CREATED);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/getBookByUUID/{uuid}", method = RequestMethod.GET)
    public BookItem getBookByUUID(@PathVariable int uuid) {
        return bookItemJdbcrepository.getBookByUUID(uuid);
    }

    @RequestMapping(value = "/getBookByTitle/{title}", method = RequestMethod.GET)
    public List<BookItem> getBookByTitle(@PathVariable String title) {
        return searchService.getBookByTitle(title);
    }

    @RequestMapping(value = "/getBookByAuthor/{author}", method = RequestMethod.GET)
    public List<BookItem> getBookByAuthor(@PathVariable String author) {
        return searchService.getBookByAuthor(author);
    }

    @RequestMapping(value = "/getBookByCategory/{category}", method = RequestMethod.GET)
    public List<BookItem> getBookByCategory(@PathVariable String category) {
        return searchService.getBookByBookCategory(category);
    }

    @GetMapping("/getAllbooks")
    private List<BookItem> getAllBookItem() {
        return booksInventoryRepo.findAll();
    }

}
