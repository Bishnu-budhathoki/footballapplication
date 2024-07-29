package org.example.footballshirt.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.footballshirt.entity.User;
import org.example.footballshirt.pojo.UserPojo;
import org.example.footballshirt.repository.UserRepository;
import org.example.footballshirt.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public Integer saveUser(UserPojo userPojo) {
        User user = new User();
        user.setUserName(userPojo.getUserName());
        user.setEmailAddress(userPojo.getEmailAddress());
        user.setPassword(userPojo.getPassword());
        user.setContact(userPojo.getContact());
        userRepository.save(user);
        return user.getUser_id();

    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }
}
