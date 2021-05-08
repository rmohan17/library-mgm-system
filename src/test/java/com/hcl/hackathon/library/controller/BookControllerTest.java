package com.hcl.hackathon.library.controller;

import com.hcl.hackathon.library.repository.BookItemJdbcrepository;
import net.minidev.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class BookControllerTest {
    @Autowired
    private static BookItemJdbcrepository bookController;

    @BeforeAll
    public static void runBeforeAllTestMethods() {
        String postUrl = "http://localhost:8080/libraryMgmSystem/";

        RestTemplate restTemplate = new RestTemplate();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("uuid", 123);
        jsonObject.put("title", "Eloquent JavaScript, Second Edition");
        jsonObject.put("author", "Marijn Haverbeke");
        jsonObject.put("bookCategory", "SCI_FI");
        jsonObject.put("edition", "first");
        jsonObject.put("barcode", "barcode1");
        jsonObject.put("publicationDate", "2014-12-14T00:00:00.000Z");
        jsonObject.put("rackLocation", 1);
        jsonObject.put("bookStatus", "AVAILABLE");
        jsonObject.put("bookFormat", "HARDCOVER");
        jsonObject.put("issueDate", "2014-12-14T00:00:00.000Z");

        HttpEntity<String> request =
                new HttpEntity<String>(jsonObject.toString());
         restTemplate.postForObject(postUrl, request, String.class);
    }

    @Test
     void getBookByUUID() {
        int uuid = 123;
        String expectedTitle = "Eloquent JavaScript, Second Edition";
        String actualTitle = bookController.getBookByUUID(uuid).getTitle();
        Assertions.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    void getBookByTitle() {
    }

    @Test
    void getBookByAuthor() {
    }

    @Test
    void getBookByCategory() {
    }
}