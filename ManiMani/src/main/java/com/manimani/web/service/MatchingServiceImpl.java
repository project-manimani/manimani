package com.manimani.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manimani.web.dao.MatchingDAO;
import com.manimani.web.vo.MatchingVO;

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
	
	

}
