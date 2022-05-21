package com.manimani.web.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.manimani.web.vo.MatchingVO;

@Service
public interface MatchingService {
	//test
	public List<MatchingVO> matchingList();
	//userList 출력
	public List<MatchingVO> MyGroupUserList(String userID);
	//user 상세정보
	public MatchingVO matchingUserDetail(int uid);
}
