package com.Sistema.De.Biblioteca.Virtual.demo.Controllers;

import com.Sistema.De.Biblioteca.Virtual.demo.DTO.BookDTO;
import com.Sistema.De.Biblioteca.Virtual.demo.DTO.UserDTO;
import com.Sistema.De.Biblioteca.Virtual.demo.Models.User.Book;
import com.Sistema.De.Biblioteca.Virtual.demo.Models.User.User;
import com.Sistema.De.Biblioteca.Virtual.demo.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookControllers {
    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody BookDTO book){
        Book newBook = bookService.createBook(book);
        return new ResponseEntity<>(newBook, HttpStatus.CREATED);
    }
    @GetMapping
    public List<Book> getAllBooks() {
        if (this.bookService != null) {
            return this.bookService.getAllBooks();
        } else {
            return Collections.emptyList();
        }
    }
}
