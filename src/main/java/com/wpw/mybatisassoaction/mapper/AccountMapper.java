package com.wpw.mybatisassoaction.mapper;

import com.wpw.mybatisassoaction.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wpw
 */
@Mapper
@Repository
public interface AccountMapper {

    /**
     * 根据用户id查找当前用户下的账户信息
     *
     * @param userId 用户id
     * @return 账户列表信息
     */
    @Select(value = "select * from account where user_id=#{userId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "accountName", column = "name")
    })
    List<Account> listAccountByUserId(Integer userId);
}
