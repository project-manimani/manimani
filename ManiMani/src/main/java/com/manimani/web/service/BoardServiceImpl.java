package com.manimani.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manimani.web.dao.*;
import com.manimani.web.vo.*;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDAO dao;

	@Override
	public List<BoardVO> boardListData(int gid) {
		return dao.boardList(gid);
	}
	
	@Override
	public int boardTotalPage() {
		return dao.boardTotalPage();
	}
	
	@Override
	public void boardInsertData(BoardVO vo) {
		return;
	}
	
	@Override
	public BoardVO boardDetailData(int bid) {
		return dao.boardDetailData(bid);
	}
}
