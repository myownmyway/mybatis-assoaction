package com.wpw.mybatisassoaction.mapper;

import com.wpw.mybatisassoaction.entity.Company;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author wpw
 */
@Mapper
@Repository
public interface CompanyMapper {
    /**
     * 根据公司id查询公司信息
     *
     * @param companyId 公司id
     * @return 公司信息
     */
    @Select(value = "select * from company where id=#{companyId}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "companyName", column = "name")
    })
    Company getByCompanyId(Integer companyId);
}
