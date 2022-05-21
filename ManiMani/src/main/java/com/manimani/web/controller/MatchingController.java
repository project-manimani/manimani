package com.manimani.web.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.manimani.web.service.MatchingService;
import com.manimani.web.vo.MatchingVO;

@Controller
public class MatchingController {
	@Autowired
	private MatchingService service;
	
	
	//userList 출력
	@GetMapping("group/matching")
	public String matching(HttpServletRequest req,Model model) {
		HttpSession session=req.getSession();
		//세션 로그인 계정 등록 (임시_로그인기능 구현시 삭제 예정)
		session.setAttribute("userID", "admin1");
		//로그인한 계정 조회
		String userID=(String)session.getAttribute("userID");
//		List<MatchingVO> list=service.MyGroupUserList(userID);
		
		List<MatchingVO> test=service.matchingList();
//		model.addAttribute("list",list);
		model.addAttribute("test",test);//
		model.addAttribute("sessionID",userID);
		model.addAttribute("group_content","matching/matching");//"group_content"
		return "group/group_template";//group/group_template //matching_template삭제
	}
}
