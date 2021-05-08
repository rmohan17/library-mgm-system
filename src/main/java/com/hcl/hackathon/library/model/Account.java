package com.hcl.hackathon.library.model;

import lombok.Data;

@Data
public class Account {
    private int accountId;
    private String userName;
    private String password;
    private String userType;
}
