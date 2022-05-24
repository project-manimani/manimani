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
	
		/* letter 목록 test */
	public List<LetterVO> letterList() {
		return mapper.letterList();
		
	}
	
	public List<LetterVO> receiveLetterList(String receiver) {
		return mapper.receiveLetterList(receiver);
	}
	
	public List<LetterVO> sendLetterList(String sender) {
		return mapper.sendLetterList(sender);
	}
	
	public int letterTotalPage(Map map) {
		return mapper.letterTotalPage(map);
	}
	
	public int letterCount(Map map) {
		return mapper.letterCount(map);
	}
}
