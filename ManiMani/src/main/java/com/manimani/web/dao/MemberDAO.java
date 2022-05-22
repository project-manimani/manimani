package com.manimani.web.dao;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manimani.web.vo.*;
import com.manimani.web.mapper.*;

@Repository
public class MemberDAO {
    
    @Autowired
    private MemberMapper mapper;
    
    public int login(String account){
        return mapper.login(account);
    }
    
    public String getPassword(String account) {
        return mapper.getPassword(account);
    }
}