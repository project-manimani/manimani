package com.manimani.web.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.manimani.web.vo.MGroupVO;
import com.manimani.web.vo.MatchingVO;
import com.manimani.web.vo.MemberVO;
import com.manimani.web.vo.MyGroupAllInfoVO;

@Mapper
public interface MatchingMapper {
	
	//session uid조회 
	@Select("SELECT uid "
			+"FROM member "
			+"WHERE account=#{account}")
	public int matchingMyUid(String account);//session 
	
	//MyGroup userList  + group정보(matchinigMyGroupInfo)
	@Select("SELECT m.*,mg.*,ma.mid,ma.view "
			+"FROM member as m "
			+"LEFT JOIN matching as ma "
			+"ON m.uid=ma.uid1 or m.uid=ma.uid2 "
			+"LEFT JOIN mgroup as mg "
			+"ON ma.gid=mg.gid "
			+"WHERE m.account IN(SELECT account "
								+"FROM group_member "
								+"WHERE gid=(SELECT gid "
											+"FROM group_member "
											+"WHERE account=#{account}) "
							+") AND m.account !=#{account}")
	public List<MyGroupAllInfoVO> matchingMyGroupUserList(String account);//account: session_"userID"	
		
	//userDetail
	@Select("SELECT * "
			+"FROM member "
			+"WHERE uid=#{uid}")
	public MemberVO matchingUserDetail(int uid);
	
	
	/* Mymanimani matching */
	//1.mid조회 (재사용)
	@Select("SELECT mid "
			+"FROM matching "
			+"WHERE uid1=#{uid1} OR uid2=#{uid2}")
	public int matchingMid(int uid1,int uid2);
//	//2.본인 mid조회 (param: matchingMid_결과값 )
//	@Select("SELECT mid "
//			+"FROM matching "
//			+"WHERE mid=#{mid}")
//	public int matchingMyMid(int mid);
	//*******************************************	
	
	//MyGroup정보 조회(param: matchingMid_결과값)
	@Select("SELECT * "
			+"FROM mgroup "
			+"WHERE gid=(SELECT gid "
						+"FROM matching "
						+"WHERE mid=#{mid})")
	public MGroupVO matchinigMyGroupInfo(int mid);
	
}
