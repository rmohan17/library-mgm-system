package com.hcl.hackathon.library.service;

import com.hcl.hackathon.library.model.BookItem;
import com.hcl.hackathon.library.model.Fine;
import com.hcl.hackathon.library.person.LibraryUser;

public interface FileService {
    public Fine calculateFine(BookItem bookItem, LibraryUser libraryUser, int days);
}
