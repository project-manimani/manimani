package com.manimani.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.manimani.web.vo.LetterVO;

@Mapper
public interface LetterMapper {
	// 편지 전체리스트
	@Select("SELECT * FROM manimani.letter")
	public List<LetterVO> letterList();
}
