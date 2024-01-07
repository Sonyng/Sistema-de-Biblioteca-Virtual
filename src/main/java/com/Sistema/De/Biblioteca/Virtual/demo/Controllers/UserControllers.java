package com.Sistema.De.Biblioteca.Virtual.demo.Controllers;

import com.Sistema.De.Biblioteca.Virtual.demo.DTO.UserDTO;
import com.Sistema.De.Biblioteca.Virtual.demo.Models.User.User;
import com.Sistema.De.Biblioteca.Virtual.demo.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserControllers {
    @Autowired
    private UserServices userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody UserDTO user){
        User newUser = userService.createUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity <List<User>> getAllUsers(){
        List<User> Users = this.userService.getAllUsers();
        return new ResponseEntity<>(Users, HttpStatus.OK);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Long id){
        if(userService.existe(id)) return ResponseEntity.notFound().build();
        userService.deletar(id);
        return ResponseEntity.noContent().build();
    }

}
