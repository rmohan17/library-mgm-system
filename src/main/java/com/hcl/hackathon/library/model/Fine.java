package com.hcl.hackathon.library.model;

import com.hcl.hackathon.library.person.LibraryUser;
import lombok.Data;

import java.util.Date;
@Data
public class Fine {
    private Date fineDate;
    private BookItem bookItem;
    private LibraryUser libraryUser;
    private Double fineValue;
}
