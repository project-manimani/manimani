package com.manimani.web.dao;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manimani.web.vo.*;
import com.manimani.web.mapper.*;

@Repository
public class UsersDAO {
    
    @Autowired
    private UsersMapper mapper;
    
    public List<UsersVO> userList(){
        return mapper.userList();
    }
}