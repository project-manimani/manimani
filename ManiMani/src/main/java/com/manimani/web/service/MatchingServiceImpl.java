package com.manimani.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manimani.web.dao.MatchingDAO;
import com.manimani.web.vo.*;

@Service
public class MatchingServiceImpl implements MatchingService{
	@Autowired
	private MatchingDAO mdao;

	@Override
	public List<MyGroupAllInfoVO> matchingMyGroupUserList(String account) {
		return mdao.matchingMyGroupUserList(account);
	}

	@Override
	public MemberVO matchingUserDetail(int uid) {
		return mdao.matchingUserDetail(uid);
	}

	@Override
	public int matchingMymanimani(String account, int uid) {
		return mdao.matchingMymanimani(account, uid);
	}

	@Override
	public MGroupVO myGroupInfo(String account) {
		// TODO Auto-generated method stub
		return mdao.myGroupInfo(account);
	}
	
	
	

}
