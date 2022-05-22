package com.manimani.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manimani.web.dao.*;
import com.manimani.web.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDAO dao;

	//test
	@Override
	public List<BoardVO> boardList() {
		// TODO Auto-generated method stub
		return dao.boardList();
	}
}
