package com.manimani.web.dao;
import java.util.Enumeration;
//mapper 조립 영역
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manimani.web.mapper.MatchingMapper;
import com.manimani.web.vo.MatchingVO;

@Repository
public class MatchingDAO {
	@Autowired
	private MatchingMapper mapper;
	
	//test * 출력
	public List<MatchingVO> matchingList(){
		return mapper.matchingList();
	}
	
	//My마니또 찾기
	//1.본인이 포함된 그룹 유저리스트 출력
	public List<MatchingVO> MyGroupUserList(String userID){			
		//본인 그룹 확인
		int MyGroupID=mapper.matchingGroupID(userID);
		//해당 그룹 모든 유저 조회
		List<MatchingVO> list=mapper.mathingUserID(MyGroupID);//uidList		
		return list;
	}
	//선택한 user 상세정보
	public MatchingVO matchingUserDetail(int uid) {
		MatchingVO vo=mapper.matchingUserDetail(uid);
		return vo;
	}

}
