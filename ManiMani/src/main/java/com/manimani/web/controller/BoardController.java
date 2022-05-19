package com.manimani.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.manimani.web.service.BoardService;
import com.manimani.web.vo.BoardVO;

@Controller
@RequestMapping("/board/")
public class BoardController {
	@Autowired
	private BoardService service;
	
	// 게시판 목록
	@GetMapping("list.do")
	public String board_list() {
		return "board";
	}
	
	// 게시판 추가
	
	// 게시판 상세

	// 게시판 수정
	
	// 게시판 삭제
	
}
