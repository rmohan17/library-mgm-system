package com.hcl.hackathon.library.repository;

import com.hcl.hackathon.library.model.BookItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksInventoryRepo extends JpaRepository<BookItem, Integer> {

}
