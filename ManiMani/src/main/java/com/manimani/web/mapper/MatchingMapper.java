package com.manimani.web.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.manimani.web.vo.MatchingVO;
import com.manimani.web.vo.MemberVO;

@Mapper
public interface MatchingMapper {

	//test
	@Select("SELECT * FROM manimani.matching")
	public List<MatchingVO> matchingList();
	
	//session uid조회 
	@Select("SELECT uid "
			+"FROM manimani.member "
			+"WHERE account=#{account}")
	public int matchingMyUid(String account);//session 
	//MyGroup userList
	@Select("SELECT * "
			+"FROM manimani.member "
			+"WHERE account IN(SELECT account "
								+"FROM manimani.group_member "
								+"WHERE gid=(SELECT gid "
											+"FROM manimani.group_member "
											+"WHERE account=#{account}) "
							+") AND account !=#{account}")
	public List<MemberVO> matchingMyGroupUserList(String account);//account: session_"userID"	
	
	
	//userDetail
	@Select("SELECT * "
			+"FROM member "
			+"WHERE uid=#{uid}")
	public MemberVO matchingUserDetail(int uid);
	
	
	//Mymanimani matching 
	//방법 1(mid조회 코드 재사용)************************
	//1.Mid조회
	@Select("SELECT mid "
			+"FROM matching "
			+"WHERE uid1=#{uid1} OR uid2=#{uid2}")
	public int matchingMid(int uid1,int uid2);
	//2.본인 (param: 1결과값 )
	@Select("SELECT mid "
			+"FROM matching "
			+"WHERE mid=#{mid}")
	public int matchingMyMid(int mid);
	//*******************************************
	
//	//방법2****************************************
//	//1.본인 mid 조회
//	@Select("SELECT mid "
//			+"FROM matching "
//			+"WHERE mid=(SELECT mid "
//						+"FROM matching "
//						+"WHERE uid1=#{uid} OR uid2=#{uid})")
//	public int matchingMyMid2(int uid);
//	//2.상대 mid 조회
//	@Select("SELECT mid "
//			+"FROM matching "
//			+"WHERE uid1=#{uid} OR uid2=#{uid}")
//	public int matchingManiMid(int uid);
//	//*******************************************	
	
}
