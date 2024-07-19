package com.user.infra.dao.repomanager;

import com.user.infra.dao.repo.UserRepository;
import com.user.infra.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDaoImpl implements UserDao {
    private final UserRepository userRepository;

    public UserDaoImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getById(Integer id) {
        if(existInCache(id))
        {
            return  fromChache(id);
        }
        else{
            User user=userRepository.getReferenceById(id);
            saveIntoCache(user);
            return user;
        }
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
         userRepository.deleteById(id);
    }

    @Override
    public void update(Integer id, User user) {

    }
}
