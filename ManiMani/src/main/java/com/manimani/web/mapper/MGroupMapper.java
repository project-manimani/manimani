package com.manimani.web.mapper;

import java.util.*;
import com.manimani.web.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MGroupMapper {
	
	@Select("SELECT mg.*, COUNT(gm.account) as num " + 
			"FROM mgroup mg " + 
			"LEFT JOIN group_member gm " + 
			"ON gm.gid=mg.gid " + 
			"WHERE mg.gid IN(SELECT gid FROM group_member WHERE account='admin1') " + 
			"group by gm.gid")
	public List<MGroupVO> groupList();
	
}
