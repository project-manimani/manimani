package com.manimani.web.service;

import org.springframework.stereotype.Service;

import com.manimani.web.vo.BoardVO;

@Service
public interface MemberService {
	
	public String login(String account, String password);
}