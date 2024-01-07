package com.Sistema.De.Biblioteca.Virtual.demo.Services;

import com.Sistema.De.Biblioteca.Virtual.demo.DTO.UserDTO;
import com.Sistema.De.Biblioteca.Virtual.demo.Models.User.User;
import com.Sistema.De.Biblioteca.Virtual.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class UserServices {
    @Autowired
    private  UserRepository repository;

    public static Optional<User> findbyid(Long bookId) {
        return null;
    }

    public List<User> getAllUsers(){
        return this.repository.findAll();
    }

    public  void saveUser(User user) {
        repository.save(user);
    }
    public void deletar(Long userId) {
        repository.deleteById(userId);
    }
    public boolean existe (Long id){
        return !repository.existsById(id);
    }
    public User createUser(UserDTO data){
        User newUser = new User(data);
        this.saveUser(newUser);
        return newUser;
    }


}

