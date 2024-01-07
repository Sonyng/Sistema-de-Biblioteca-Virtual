package com.Sistema.De.Biblioteca.Virtual.demo.Services;
import com.Sistema.De.Biblioteca.Virtual.demo.DTO.BookDTO;
import com.Sistema.De.Biblioteca.Virtual.demo.Models.User.Book;
import com.Sistema.De.Biblioteca.Virtual.demo.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public List<Book> getAllBooks(){
        return this.repository.findAll();
    }
    public  void save(Book book) {
        repository.save(book);
    }

    public Book createBook(BookDTO data){
        Book newBook = new Book(data);
        this.save(newBook);
        return newBook;
    }



}



