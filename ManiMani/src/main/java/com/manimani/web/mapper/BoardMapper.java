package com.manimani.web.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.manimani.web.vo.*;

@Mapper
public interface BoardMapper {
    
    @Select("SELECT * FROM manimani.board")
    public List<BoardVO> boardList();
}