package com.user.Services;

import com.user.infra.dao.repomanager.UserDao;
import com.user.infra.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service //it will provide implementation for service class
public class UserServiceImpl implements UserService {

  private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getusers() {
        return userDao.findAll();
    }

    @Override
    public User getUserbyId(int userId) {

        return userDao.getById(userId);
    }

    @Override
    public User addUser(User user) {
        return userDao.save(user) ;
    }

    @Override
    public User updateuser(int userId, User userdetails) {
        return null;
    }

    @Override
    public void deleteuser(int userId) {
        userDao.delete(userId);

    }
}
