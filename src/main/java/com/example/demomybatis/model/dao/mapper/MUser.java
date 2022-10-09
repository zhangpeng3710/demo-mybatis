package com.example.demomybatis.model.dao.mapper;

import com.example.demomybatis.model.dao.entity.EUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MUser {

    @Select("select * from user where id= #{id}")
    EUser findById(Integer id);

}
