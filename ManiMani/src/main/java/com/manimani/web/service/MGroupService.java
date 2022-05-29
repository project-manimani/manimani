package com.manimani.web.service;

import org.springframework.stereotype.Service;
import com.manimani.web.vo.*;
import java.util.*;

@Service
public interface MGroupService {
	
	public List<MGroupVO> mGroupListData();
	
	public void groupInsert(String id,String code, int admin);
	
	public String findingGroup(String code);
}
