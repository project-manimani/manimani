package com.manimani.web.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.manimani.web.vo.*;

@Mapper
public interface UsersMapper {
    
    @Select("SELECT * FROM users")
    public List<UsersVO> userList();
}