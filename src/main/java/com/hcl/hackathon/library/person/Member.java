package com.hcl.hackathon.library.person;

import com.hcl.hackathon.library.service.BookBrowseService;
import com.hcl.hackathon.library.service.SearchService;

public class Member extends LibraryUser {
    private int totalBookCheckedOut;
    private SearchService searchServiceObj;
    private BookBrowseService bookBrowseService;
}
