package org.example.footballshirt.service;

import org.example.footballshirt.entity.User;
import org.example.footballshirt.pojo.UserProjection;
import org.example.footballshirt.pojo.UserPojo;

import java.util.List;

public interface UserService {

    Integer
    saveUser(UserPojo userPojo);

    List<User> findAll();
    List<UserProjection> findAll1();

    User findById(Integer id);

    void deleteById(Integer id);
}
