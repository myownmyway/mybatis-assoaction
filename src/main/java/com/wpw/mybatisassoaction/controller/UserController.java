package com.wpw.mybatisassoaction.controller;

import com.wpw.mybatisassoaction.entity.User;
import com.wpw.mybatisassoaction.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wpw
 */
@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/get")
    public User getUserByUserId(@RequestParam(value = "userId") Integer userId) {
        return userService.getUserByUserId(userId);
    }

    @GetMapping(value = "/getUserWithCompany")
    public User getUserWithCompany(@RequestParam(value = "userId") Integer userId) {
        return userService.getUserWithCompany(userId);
    }

    @GetMapping(value = "/getUserWithAccountList")
    public User getUserWithAccountList(@RequestParam(value = "userId") Integer userId) {
        return userService.getUserWithAccountList(userId);
    }

    @GetMapping(value = "/optionUser")
    public User optionUser(@RequestParam(value = "userId") Integer userId) {
        return userService.optionUser(userId);
    }

    @GetMapping(value = "/selectOne")
    public User selectOne(@RequestParam(value = "userId") Integer userId) {
        return userService.selectOne(userId);
    }
}
