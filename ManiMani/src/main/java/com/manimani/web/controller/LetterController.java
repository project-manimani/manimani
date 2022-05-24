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
	
    @RequestMapping("/letter")
    public String group(HttpServletRequest request, Model model) {
    	// 로그인 내역 확인
    	HttpSession session = request.getSession();
    	session.setAttribute("userID","admin1");	//임시
    	
    	
    	// letter 목록조회
        List<LetterVO> list = service.letterList();
    	
        model.addAttribute("letter_content", "letter/letter");
        model.addAttribute("list",list);
        return "letter/letter_template";  
    }
}
