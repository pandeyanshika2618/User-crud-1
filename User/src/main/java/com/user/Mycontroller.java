package com.user;
import com.user.infra.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import  java.util.List;

import com.user.Services.UserService;

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
     public List<User> getUsers()
     {
       return  this.userService.getusers();
     }
     @GetMapping ("/users/{userId}")
     public User getUserbyId(@PathVariable int userId)
     {
           return this.userService. getUserbyId(userId);
     }
     @PostMapping ("/users")
    public User addUser (@RequestBody User user)
     {
          return this.userService.addUser(user);
     }
     @PutMapping ("/{userId}")
    public User updateUser (@PathVariable int userId , @RequestBody User userdetails)
     {
         return userService.updateuser(userId , userdetails);
     }
     @DeleteMapping ("/{userId}")
    public String deleteUser (@PathVariable int userId)
     {
         return "User with Id " +userId  +"deleted !!";
     }

}
