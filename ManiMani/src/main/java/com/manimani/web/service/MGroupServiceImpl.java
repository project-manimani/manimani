package com.manimani.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manimani.web.vo.MGroupVO;
import com.manimani.web.dao.*;

@Service
public class MGroupServiceImpl implements MGroupService{
	@Autowired
	private MGroupDAO dao;
	
	@Override
	public List<MGroupVO> mGroupListData() {

		return dao.mgroupListData();
	}
	
	@Override
	public void groupInsert(String id, String code, int admin) {
		dao.groupInsert(id,code,admin);		
	}
	
	@Override
	public String findingGroup(String code) {
		
		return dao.findingGroup(code);
	}
	

}
