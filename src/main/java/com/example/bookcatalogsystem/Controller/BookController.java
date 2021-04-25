/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 25-Apr-21
 *   Time: 5:30 PM
 *   File: BookController.java
 */

package com.example.bookcatalogsystem.Controller;

import com.example.bookcatalogsystem.Model.Book;
import com.example.bookcatalogsystem.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/insertBook")
    public String insertBook(@RequestBody Book book) {
        return bookService.insertBook(book);
    }
    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    @GetMapping("/getBookById/{id}")
    public Book getBookById(@PathVariable long id) {
        return bookService.getBookById(id);
    }
    @DeleteMapping("/deleteById{id}")
    public boolean deleteById(@PathVariable long id){
        return bookService.deleteById(id);
    }

}

