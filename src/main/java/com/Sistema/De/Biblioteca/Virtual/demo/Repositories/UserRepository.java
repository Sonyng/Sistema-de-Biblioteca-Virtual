package com.Sistema.De.Biblioteca.Virtual.demo.Repositories;

import com.Sistema.De.Biblioteca.Virtual.demo.Models.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
   Optional<User> findUserBycpf(String cpf);


}
