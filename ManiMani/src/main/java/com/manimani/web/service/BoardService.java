package com.manimani.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.manimani.web.vo.BoardVO;

@Service
public interface BoardService {
	
	public List<BoardVO> boardList();
}