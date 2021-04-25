/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 25-Apr-21
 *   Time: 5:31 PM
 *   File: BookService.java
 */

package com.example.bookcatalogsystem.Service;

import com.example.bookcatalogsystem.Model.Book;
import com.example.bookcatalogsystem.Repository.BooksDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BooksDB booksDB;
    public String insertBook(Book book) {
        return booksDB.saveBook(book);
    }
}

