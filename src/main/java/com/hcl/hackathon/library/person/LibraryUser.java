package com.hcl.hackathon.library.person;

import com.hcl.hackathon.library.model.Account;
import com.hcl.hackathon.library.service.BookBrowseService;

public class LibraryUser extends Person{
    private String email;
    private String phoneNumber;
    private Account account;
    private BookBrowseService bookBrowseService;

}
