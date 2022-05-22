package com.manimani.web.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.manimani.web.vo.MatchingVO;
import com.manimani.web.vo.MemberVO;

@Service
public interface MatchingService {
	//test
	public List<MatchingVO> matchingList();
	//MyGroup userList
	public List<MemberVO> matchingMyGroupUserList(String account);
	//userDetail
	public MemberVO matchingUserDetail(int uid);
	//match MyManimani
	public int matchingMymanimani(String account,int uid);
}
