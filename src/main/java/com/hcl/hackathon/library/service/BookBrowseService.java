package com.hcl.hackathon.library.service;

import com.hcl.hackathon.library.model.BookItem;
import com.hcl.hackathon.library.person.LibraryUser;

public interface BookBrowseService {
    public BookReservationDetail getReservationDetail(BookItem bookItem);

    public void updateReservationDetail(BookReservationDetail bookReservationDetail);

    public BookReservationDetail reserveBook(BookItem bookItem, LibraryUser libraryUser);

    public  BookIssueDetail issueBook(BookItem bookItem, LibraryUser libraryUser);

}
