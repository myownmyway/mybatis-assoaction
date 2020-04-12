package com.wpw.mybatisassoaction.service.impl;

import com.wpw.mybatisassoaction.entity.User;
import com.wpw.mybatisassoaction.mapper.UserMapper;
import com.wpw.mybatisassoaction.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author wpw
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserByUserId(Integer userId) {
        return userMapper.getUserByUserId(userId);
    }

    @Override
    public User getUserWithCompany(Integer userId) {
        return userMapper.getUserWithCompany(userId);
    }

    @Override
    public User getUserWithAccountList(Integer userId) {
        return userMapper.getUserWithAccountList(userId);
    }

    @Override
    public User optionUser(Integer userId) {
        return userMapper.optionUser(userId);
    }

    @Override
    public User selectOne(Integer userId) {
        return  userMapper.selectOne(userId);
    }
}
