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
    
    // 게시판 페이지 개수
    public int boardTotalPage() {
    	return mapper.boardTotalPage();
    }
    
    // 게시판 입력
    public void boardInsertData(BoardVO vo) {
    	mapper.boardInsertData(vo);
    }
    
    // 게시판 상세보기
    public BoardVO boardDetailData(int bid) {
    	mapper.boardVisitIncrement(bid);
    	return mapper.boardDetailData(bid);
    }
}