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
	
	//MyGroup userList & groupInfo
	public List<MyGroupAllInfoVO> matchingMyGroupUserList(String account) {//account:session_"userID"
		List<MyGroupAllInfoVO> list=mapper.matchingMyGroupUserList(account);
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
		int myMid=mapper.matchingMid(myUid,myUid);
//		int MyMid=mapper.matchingMyMid(mid);
		//선택 상대 mid 조회
		int myMani=mapper.matchingMid(uid,uid);
		if(myMid==myMani) {
			maniCheck=1;
		}
		return maniCheck;
	}
	
	public MGroupVO myGroupInfo(String account) {
		//본인 mid 조회
		int myUid=mapper.matchingMyUid(account);
		int myMid=mapper.matchingMid(myUid,myUid);
		MGroupVO vo=mapper.matchinigMyGroupInfo(myMid);
		return vo;
	}
	
}
