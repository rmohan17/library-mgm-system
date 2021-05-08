package com.hcl.hackathon.library.model;

import com.hcl.hackathon.library.constants.BookCategory;
import com.hcl.hackathon.library.constants.BookFormat;
import com.hcl.hackathon.library.constants.BookStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "BookItem")
public class BookItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique=true)
    private int uuid;
    public String title;
    public String author;
    public String bookCategory;
    public String edition;
    private String barcode;
    private Date publicationDate;
    private int rackLocation;
    private String bookStatus;
    private String bookFormat;
    private Date issueDate;

}
