package com.manimani.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manimani.web.dao.MatchingDAO;
import com.manimani.web.vo.MatchingVO;
import com.manimani.web.vo.MemberVO;

@Service
public class MatchingServiceImpl implements MatchingService{
	@Autowired
	private MatchingDAO mdao;

	//test
	@Override
	public List<MatchingVO> matchingList() {
		// TODO Auto-generated method stub
		return mdao.matchingList();
	}

	@Override
	public List<MemberVO> matchingMyGroupUserList(String account) {
		// TODO Auto-generated method stub
		return mdao.matchingMyGroupUserList(account);
	}

	@Override
	public MemberVO matchingUserDetail(int uid) {
		// TODO Auto-generated method stub
		return mdao.matchingUserDetail(uid);
	}

	@Override
	public int matchingMymanimani(String account, int uid) {
		// TODO Auto-generated method stub
		return mdao.matchingMymanimani(account, uid);
	}
	
	
	

}
