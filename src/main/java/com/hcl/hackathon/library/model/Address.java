package com.hcl.hackathon.library.model;

import lombok.Data;

@Data
public class Address {
    private String street;
    private String city;
    private String state;
    private int zipCode;
    private String country;

}
