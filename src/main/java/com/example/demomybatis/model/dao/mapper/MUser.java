package com.example.demomybatis.model.dao.mapper;

import com.example.demomybatis.model.dao.entity.EUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MUser {

    @Select("select * from people where id= #{id}")
    EUser findById(int id);

    @Select("select * from people")
    List<EUser> findAllId();

}
