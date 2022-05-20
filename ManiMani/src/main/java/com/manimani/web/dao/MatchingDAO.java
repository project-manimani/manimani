package com.manimani.web.dao;
//mapper 조립 영역
import java.util.List;

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
	

}
