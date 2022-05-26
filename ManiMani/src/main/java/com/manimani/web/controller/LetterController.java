package com.manimani.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.manimani.web.dao.*;
import com.manimani.web.service.LetterService;
import com.manimani.web.vo.*;

@Controller
@RequestMapping("/letter")
public class LetterController {
	@Autowired
	private LetterService service;
	
	@Autowired
	private LetterDAO dao;
	
	/* 받은편지 목록 */
	@GetMapping("letter")
	public String receivelist(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		// 편지받은 아이디
		String receiver = ((String) session.getAttribute("receiver"));
		if( receiver == null )
			return "redirece:../login";
		// List<LetterVO> rlist = service.receiveList(receiver);
		
		model.addAttribute("receiver",receiver);
		model.addAttribute("letter_content", "letter/letter");
		return "letter/letter_template";
	}
}
