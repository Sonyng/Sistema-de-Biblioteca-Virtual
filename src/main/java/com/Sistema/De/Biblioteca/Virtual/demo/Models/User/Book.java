package com.Sistema.De.Biblioteca.Virtual.demo.Models.User;

import com.Sistema.De.Biblioteca.Virtual.demo.DTO.BookDTO;
import com.Sistema.De.Biblioteca.Virtual.demo.DTO.UserDTO;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.security.PrivateKey;
import java.util.List;

@Table(name = "Books")
@Entity(name = "Books")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Title")
    private String Title;

    @Column(name = "Release")
    private String ReleaseBook;

    private int Estoque;

    private String Autor;

    private String Image;

    private String Type;

    private String Preface;

    private String Pages;

    private BigDecimal Cost;

    @ManyToMany
    @JoinTable(name = "User", joinColumns = @JoinColumn(name = "Book_id"),
            inverseJoinColumns = @JoinColumn(name = "User_id"))
    private List<Book> books;

    public Book(BookDTO data) {
        this.Title = data.Title();
        this.ReleaseBook = data.ReleaseBook();
        this.Estoque = data.Estoque();
        this.Autor = data.Autor();
        this.Image = data.Image();
        this.Preface = data.Preface();
        this.Pages = data.Pages();
        this.Cost = data.Cost();

    }
}
