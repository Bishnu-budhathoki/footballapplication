package org.example.footballshirt.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.footballshirt.entity.User;
import org.example.footballshirt.pojo.GlobalApiResponse;
import org.example.footballshirt.pojo.UserPojo;
import org.example.footballshirt.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public GlobalApiResponse<Integer> saveUser(@RequestBody @Valid UserPojo userPojo){
        GlobalApiResponse<Integer> globalApiResponse = new GlobalApiResponse<>();
        Integer id = userService.saveUser(userPojo);
        globalApiResponse.setData(id);
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("data saved successfully");
        return globalApiResponse;
    }

    @GetMapping
    public GlobalApiResponse<List<User>>findAll() {
        GlobalApiResponse<List<User>> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setData(userService.findAll());
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("data retrieved successfully");
        return globalApiResponse;
    }

    @DeleteMapping("/delete/{id}")
    public GlobalApiResponse<Integer> deleteData(@PathVariable Integer id){
        GlobalApiResponse<Integer> globalApiResponse = new GlobalApiResponse<>();
        userService.deleteById(id);

        globalApiResponse.setData(null);
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Data deleted successfully");

        return globalApiResponse;
    }

    @GetMapping("/getById{id}")
    public GlobalApiResponse<User> findById(@PathVariable Integer id) {
        GlobalApiResponse<User> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setData(userService.findById(id));
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("data retrieved successfully");
        return globalApiResponse;

    }
}
