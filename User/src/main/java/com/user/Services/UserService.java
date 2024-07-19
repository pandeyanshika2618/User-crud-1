package com.user.Services;
import com.user.infra.entity.User;
import    java.util.List;
public interface UserService  {
    public List<User> getusers();
    public User getUserbyId(int userId );
     public User addUser(User user);
     public User updateuser (int userId , User userdetails);
   public void deleteuser(int userId);

}
