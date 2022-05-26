package com.manimani.web.service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manimani.web.dao.*;
import com.manimani.web.vo.*;

@Service
public class LetterServicelmpl implements LetterService {
	@Autowired
	private LetterDAO dao;
	
	@Override
	public List<LetterVO> letterList() {
		return dao.letterList();
	}

	@Override
	public List<LetterVO> receiveList(String receiver) {
		return dao.receiveList(receiver);
	}

	@Override
	public List<LetterVO> sendList(String sender) {
		return dao.sendList(sender);
	}
	
	
	
}
