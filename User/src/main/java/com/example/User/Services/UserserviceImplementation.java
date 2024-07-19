package com.example.User.Services;

import com.example.User.entity.user;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service //it will provide implementation for service class
public class UserserviceImplementation implements UserService {
    private user user ;
    List<user> Userlist ;
    public UserserviceImplementation()
    {
         Userlist = new ArrayList<>();
        user.Address address = new user.Address();
        address.setStreet("rohini road");
        address.setCity("Delhi");
        address.setState("Delhi");

        Userlist.add(new user(1, "Anjali", "(758188089", address));
        user.Address address2 = new user.Address();
        address2.setStreet("45 sector 41");
        address2.setCity("Noida");
        address2.setState("Up");

        user user2 = new user(2, "Ankita", "7005187797", address2);
        Userlist.add(user2);


        user.Address address3 = new user.Address();
        address3.setStreet("sec 70");
        address3.setCity("Noida");
        address3.setState("Up");

        user user3 = new user(3, "riya", "9568826704 ", address3);
        Userlist.add(user3);
    }
    @Override
    public List<user> getusers()
    {
       return Userlist;
    }
    @Override
    public user getUserbyId(int userId)
    {
          user a = null ;
          for (user b : Userlist )
           {
              if(b.getId() == userId )
              {
                  a = b ;
                  break;
              }
          }
          return a ;
    }
  public user addUser(user user)
  {
      Userlist.add(user);
      return user ;
  }

    @Override
    public user updateuser(int userId , user userdetails) {
        user new_userdetails = userdetails ;
        for (user a :Userlist)
        {
             if (a.getId() == userId)
             {
                  a = new_userdetails;
             }
        }
        return new_userdetails  ;
    }
    @Override
   public  void deleteuser(int userId)
    {
        Userlist.removeIf(user -> user.getId() == userId);
    }
}
