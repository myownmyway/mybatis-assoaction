package com.wpw.mybatisassoaction.service;

import com.wpw.mybatisassoaction.entity.User;

/**
 * @author pc
 */
public interface UserService {
    /**
     * 根据用户id查询用户信息
     *
     * @param userId 用户id
     * @return 用户信息
     */
    User getUserByUserId(Integer userId);

    /**
     * 根据用户id获取用户信息
     *
     * @param userId 用户id
     * @return 用户信息，不含有用户账户信息
     */
    User getUserWithCompany(Integer userId);

    /**
     * 根据用户id获取用户信息
     *
     * @param userId 用户id
     * @return 用户信息，不含有公司信息
     */
    User getUserWithAccountList(Integer userId);

    /**
     * 根据用户id获取用户信息
     * @param userId 用户id
     * @return 用户信息
     */
    User optionUser(Integer userId);

    /**
     * 根据用户id获取用户信息
     * @param userId 用户id
     * @return 用户信息
     */
    User selectOne(Integer userId);
}
