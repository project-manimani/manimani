package com.manimani.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manimani.web.service.MatchingService;
import com.manimani.web.vo.MemberVO;

@RestController
public class MatchingRestController {
	@Autowired
	private MatchingService service;
	
	@PostMapping("group/userDetail")
	public MemberVO group_userDetail(int userID) {
		MemberVO vo=service.matchingUserDetail(userID);		
		return vo;
	}
	
	@PostMapping("group/matchingCheck")
	public String matchingCheck(int maniUid,HttpServletRequest req) {
		String result="F";
//		MemberVO vo=service.matchingUserDetail(maniUid);//기능 추가시 ( email 전송 )
		HttpSession session=req.getSession();
		String userID=(String)session.getAttribute("userID");
		int maniCheck=service.matchingMymanimani(userID, maniUid);
		if(maniCheck==1) result="T";
		
		return result;
	}
	
}
