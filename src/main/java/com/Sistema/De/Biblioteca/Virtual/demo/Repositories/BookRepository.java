package com.Sistema.De.Biblioteca.Virtual.demo.Repositories;

import com.Sistema.De.Biblioteca.Virtual.demo.Models.User.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findBookById (Long id);

}
