package com.Sistema.De.Biblioteca.Virtual.demo.Models.User;


import com.Sistema.De.Biblioteca.Virtual.demo.DTO.UserDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity(name= "Users")
@Table(name= "Users")
@Getter @Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastname;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String cpf;

    private String password;
    private BigDecimal balance;

    @ManyToMany
    @JoinTable(name = "Book", joinColumns = @JoinColumn(name = "User_id"),
            inverseJoinColumns = @JoinColumn(name = "Book_id"))
    private List<Book> books;

    // Adicione este construtor padrão
    public User() {
    }

    public User(UserDTO data) {
        this.firstName = data.firstName();
        this.lastname = data.lastname();
        this.email = data.email();
        this.cpf = data.cpf();
        this.password = data.password();
    }

}
