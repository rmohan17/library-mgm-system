package com.hcl.hackathon.library.service;

import com.hcl.hackathon.library.model.BookItem;
import com.hcl.hackathon.library.person.LibraryUser;

public class BookBrowseServiceImpl implements BookBrowseService {
    @Override
    public BookReservationDetail getReservationDetail(BookItem bookItem) {
        return null;
    }

    @Override
    public void updateReservationDetail(BookReservationDetail bookReservationDetail) {

    }

    @Override
    public BookReservationDetail reserveBook(BookItem bookItem, LibraryUser libraryUser) {
        return null;
    }

    @Override
    public BookIssueDetail issueBook(BookItem bookItem, LibraryUser libraryUser) {
        return null;
    }
}
