package com.manimani.web.dao;
//mapper 조립 영역
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manimani.web.mapper.MatchingMapper;
import com.manimani.web.vo.*;

@Repository
public class MatchingDAO {
	@Autowired
	private MatchingMapper mapper;
	
	//MyGroup userList
	public List<MemberVO> matchingMyGroupUserList(String account) {//account:session_"userID"
		List<MemberVO> list=mapper.matchingMyGroupUserList(account);
		return list;
	}
	//userDetail
	public MemberVO matchingUserDetail(int uid) {
		MemberVO vo=mapper.matchingUserDetail(uid);
		return vo;
	}
	
	//match MyManimani
	public int matchingMymanimani(String account,int uid) {//account:session_"userID",uid:선택uid
		int maniCheck=-1;
		//본인 mid 조회
		int myUid=mapper.matchingMyUid(account);
		int mid=mapper.matchingMid(myUid);
		int MyMid=mapper.matchingMyMid(mid);
		//선택 상대 mid 조회
		int MyMani=mapper.matchingMid(uid);
		if(MyMid==MyMani) {
			maniCheck=1;
		}
		return maniCheck;
	}
	
	
	
	
	

}
