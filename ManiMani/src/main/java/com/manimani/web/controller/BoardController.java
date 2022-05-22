package com.manimani.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import com.manimani.web.service.BoardService;
import com.manimani.web.vo.BoardVO;
import com.manimani.web.vo.MGroupVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService service;
	
	// 게시판 목록
	@RequestMapping("/board")
	public String board(Model model) {
        List<BoardVO> list = service.boardList();
        model.addAttribute("board_content", "board/board");
        model.addAttribute("list",list);
        return "board/board_template";  
    }
}
