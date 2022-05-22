package com.manimani.web.dao;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manimani.web.vo.*;
import com.manimani.web.mapper.*;

@Repository
public class BoardDAO {
    
    @Autowired
    private BoardMapper mapper;
    
    // 게시판 리스트
    public List<BoardVO> boardList(){
        return mapper.boardList();
   
    }
}