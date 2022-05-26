package com.manimani.web.mapper;

import java.util.*;
import com.manimani.web.vo.*;

import org.apache.ibatis.annotations.Insert;
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
	
	@Insert("INSERT INTO group_member(gid,account,admin) VALUES ((SELECT gid from mgroup where code=#{code}),#{account},#{admin})")
	public void groupInsert(String id, String code, int admin);
	
}
