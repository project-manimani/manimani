package com.manimani.web.controller;

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
		Map map = new HashMap();
        List<BoardVO> list = service.boardListData(map);
        model.addAttribute("list",list);
        model.addAttribute("board_content", "board/board");
        return "board/board_template";
    }
	/*@GetMapping("/board")
	public String board_list() {
		return "board/board_template";
	}*/	
}
