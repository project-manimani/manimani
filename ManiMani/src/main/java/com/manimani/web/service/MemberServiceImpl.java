package com.manimani.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manimani.web.dao.*;

@Service
public class MemberServiceImpl implements MemberService{
	
    @Autowired
	private MemberDAO dao;

	//test
	@Override
	public String login(String account, String password) {
	    String result = "";
	    int num = dao.login(account);
	    if (num > 0) {
	        if (password.equals(dao.getPassword(account))) {
	            result = account;
	        } else {
	            result = "아이디와 비밀번호가 일치하지 않습니다";
	        }
	    } else {
	        result = "존재하지 않는 아이디입니다";
	    }
	    return result;
	}
}
