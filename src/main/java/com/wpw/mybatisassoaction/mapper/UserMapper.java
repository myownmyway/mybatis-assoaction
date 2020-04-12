package com.wpw.mybatisassoaction.mapper;

import com.wpw.mybatisassoaction.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * @author wpw
 */
@Mapper
@Repository
public interface UserMapper {
    /**
     * 根据用户id获取用户信息
     *
     * @param userId 用户id
     * @return 用户信息
     */
    @Select(value = "select * from user where id=#{userId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "company", column = "company_id", one = @One(select = "com.wpw.mybatisassoaction.mapper.CompanyMapper.getByCompanyId")),
            @Result(property = "accountList", column = "id", many = @Many(select = "com.wpw.mybatisassoaction.mapper.AccountMapper.listAccountByUserId"))
    })
    User getUserByUserId(Integer userId);

    /**
     * 根据用户id获取用户信息
     *
     * @param userId 用户id
     * @return 用户信息，不含有账户信息
     */
    @Select(value = "select * from user where id=#{userId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "company", column = "company_id", one = @One(select = "com.wpw.mybatisassoaction.mapper.CompanyMapper.getByCompanyId"))
    })
    User getUserWithCompany(Integer userId);

    /**
     * 根据用户id获取用户信息
     *
     * @param userId 用户id
     * @return 用户信息，不含有公司信息
     */
    @Select(value = "select * from user where id=#{userId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "accountList", column = "id", many = @Many(select = "com.wpw.mybatisassoaction.mapper.AccountMapper.listAccountByUserId"))
    })
    User getUserWithAccountList(Integer userId);

    /**
     * 根据用户id获取用户信息
     *
     * @param userId 用户id
     * @return 用户信息
     */
    User optionUser(Integer userId);

    /**
     * 根据用户id获取用户信息
     *
     * @param userId 用户id
     * @return 用户信息
     */
    User selectOne(Integer userId);
}
