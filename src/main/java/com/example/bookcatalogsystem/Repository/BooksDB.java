/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 25-Apr-21
 *   Time: 5:33 PM
 *   File: BooksDB.java
 */

package com.example.bookcatalogsystem.Repository;

import com.example.bookcatalogsystem.Model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class BooksDB {
    ArrayList<Book> booksList = new ArrayList<>();

    public String saveBook(Book book) {
        for (Book books : booksList) {
            if (books.getId() == book.getId()) {
                return "Not able to store the book";
            }
        }
        booksList.add(book);
        System.out.println(book + " is  inserted");
        return "Able to store the book";
    }
}

