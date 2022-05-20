package com.manimani.web.controller;


import java.util.List;

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
	
	//test
	@GetMapping("group/matching")
	public String matching(Model model) {
		
		List<MatchingVO> test=service.matchingList();
		
		model.addAttribute("test",test);
		model.addAttribute("group_content","matching/matching");//"group_content"
		return "group/group_template";//group/group_template //matching_template삭제
	}
	
}
