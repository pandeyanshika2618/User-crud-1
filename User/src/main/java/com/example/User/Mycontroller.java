package com.example.User;
import  com.example.User.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import  java.util.List;
import java.util.Optional;

import  com.example.User.Services.UserService;
import   com.example.User.Services.UserserviceImplementation ;
@RestController
public class Mycontroller {
    @Autowired //It will inject the object from the class which implemeted This interface
    public UserService userService;
    @GetMapping ("/home")
    public String home()
    {
         return "This is main page";
    }
    //get the list of users
    @GetMapping ("/users")
     public List<user > getUsers()
     {
       return  this.userService.getusers();
     }
     @GetMapping ("/users/{userId}")
     public user getUserbyId(@PathVariable int userId)
     {
           return this.userService. getUserbyId(userId);
     }
     @PostMapping ("/users")
    public user addUser ( @RequestBody user user)
     {
          return this.userService.addUser(user);
     }
     @PutMapping ("/{userId}")
    public user updateUser (@PathVariable int userId , @RequestBody user userdetails)
     {
         return userService.updateuser(userId , userdetails);
     }
     @DeleteMapping ("/{userId}")
    public String deleteUser (@PathVariable int userId)
     {
         return "User with Id " +userId  +"deleted !!";
     }

}
