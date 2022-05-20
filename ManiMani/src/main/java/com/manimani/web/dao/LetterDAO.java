package com.manimani.web.dao;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manimani.web.mapper.LetterMapper;
import com.manimani.web.vo.LetterVO;

@Repository
public class LetterDAO {
	@Autowired
	private LetterMapper mapper;
	
		// letter 목록
		public List<LetterVO> letterList() {
		return mapper.letterList();
	}
}
