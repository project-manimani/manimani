package com.manimani.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.manimani.web.vo.BoardVO;

@Service
public interface BoardService {
	// 게시판 리스트
	public List<BoardVO> boardListData(int gid);
	
	// 게시판 페이지 개수
	public int boardTotalPage();
	
	// 게시판 입력
	public void boardInsertData(BoardVO vo);
	
	// 게시판 상세보기 + 조회수 증가
	public BoardVO boardDetailData(int bid);
}