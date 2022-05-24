package com.manimani.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.manimani.web.vo.BoardVO;

@Service
public interface BoardService {
	
	public List<BoardVO> boardListData(Map map);
	
	public int boardTotalPage(int bid);
}