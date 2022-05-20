package com.manimani.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.manimani.web.service.BoardService;
import com.manimani.web.vo.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService service;
	
	// 게시판 목록
	@RequestMapping("/board")
	public String board_list(Model model) {
		
		List<BoardVO> test=service.boardList();
		
		model.addAttribute("test",test);
		model.addAttribute("board_content", "board/board");
		return "board/board_template";
	}

}
