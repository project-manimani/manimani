package com.manimani.web.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manimani.web.service.MatchingService;
import com.manimani.web.vo.MatchingVO;

@Controller
@RequestMapping("/matching")
public class MatchingController {
	@Autowired
	private MatchingService service;
	
	//test
	@RequestMapping("/matching")
	public String matching(Model model) {
		
		List<MatchingVO> test=service.matchingList();
		
		model.addAttribute("test",test);
		model.addAttribute("matching_content","matching/matching");
		return "matching/matching_template";
	}
	
}
