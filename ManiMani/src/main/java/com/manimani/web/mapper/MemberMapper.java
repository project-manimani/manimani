package com.manimani.web.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.manimani.web.vo.*;

@Mapper
public interface MemberMapper {
    
    @Select("SELECT count(*) FROM member WHERE account=#{account}")
    public int login(String account);
    
    @Select("SELECT password FROM member WHERE account=#{account}")
    public String getPassword(String account);
}