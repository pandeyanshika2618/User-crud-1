package com.user.infra.dao.repomanager;

import com.user.infra.entity.User;

import java.util.List;

public interface UserDao {
    public User getById(Integer id);
    List<User> findAll();
    User save(User user);
       void delete(Integer id);
       void update(Integer id , User user);

}
