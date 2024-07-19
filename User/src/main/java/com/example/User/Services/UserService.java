package com.example.User.Services;
import  com.example.User.entity.user;
import    java.util.List;
public interface UserService  {
    public List<user> getusers();
    public  user getUserbyId(int userId );
     public  user addUser(user user);
     public  user  updateuser (int userId ,user userdetails);
   public void deleteuser(int userId);

}
