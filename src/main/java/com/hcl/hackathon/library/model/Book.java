package com.hcl.hackathon.library.model;

import com.hcl.hackathon.library.constants.BookCategory;
import lombok.Data;

@Data
public class Book {
    public String title;
    public String author;
    public BookCategory bookCategory;
    public String edition;

}
