package org.example.footballshirt.service;

import org.example.footballshirt.entity.User;
import org.example.footballshirt.pojo.UserPojo;

import java.util.List;

public interface UserService {

    Integer
    saveUser(UserPojo userPojo);

    List<User> findAll();

    User findById(Integer id);

    void deleteById(Integer id);
}
