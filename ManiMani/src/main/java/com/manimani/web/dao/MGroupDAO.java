package com.manimani.web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manimani.web.mapper.MGroupMapper;
import java.util.*;
import com.manimani.web.vo.*;

@Repository
public class MGroupDAO {
	@Autowired
	private MGroupMapper mapper;
	
	public List<MGroupVO> mgroupListData(){
		return mapper.groupList();
	}
	
	public void groupInsert(String id, String code, int admin) {
		mapper.groupInsert(id,code,admin);
	}
	
}
