package com.manimani.web.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.manimani.web.vo.MatchingVO;

@Mapper
public interface MatchingMapper {

	//test
	@Select("SELECT * FROM manimani.matching")
	public List<MatchingVO> matchingList();
	
	//My마니또 맞추기
	//1.본인이 포함된 그룹 유저리스트 출력
	//1-1. 본인 해당 그룹찾기 => account(session:"userID")의 gid 조회
	@Select("SELECT gid "
			+"FROM group_member "
			+"WHERE account=#{account}")
	public int matchingGroupID(String account);		
	//1-2. 1결과값(gid)을 이용해서 본인을 제외한  MyGroup 모든 user 조회
	@Select("SELECT uid1,uid2 "
			+"FROM matching "
			+"WHERE gid=#{gid}")
	public List<MatchingVO> mathingUserID(int gid);
	
	//2. 선택한  user 상세정보
	@Select("SELECT * "
			+"FROM member "
			+"WHERE uid=#{uid}")
	public MatchingVO matchingUserDetail(int uid);
	
	
}
