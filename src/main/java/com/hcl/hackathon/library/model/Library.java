package com.hcl.hackathon.library.model;

import lombok.Data;

import java.util.List;
@Data
public class Library {
    private String name;
    private Address location;
    List<BookItem> books;
}
