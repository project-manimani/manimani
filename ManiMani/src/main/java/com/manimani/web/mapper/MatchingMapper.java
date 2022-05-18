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
}
