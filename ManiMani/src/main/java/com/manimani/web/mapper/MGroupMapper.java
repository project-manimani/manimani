package com.manimani.web.mapper;

import java.util.*;
import com.manimani.web.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MGroupMapper {
	
	@Select("SELECT * FROM MGroup")
	public List<MGroupVO> groupList();
}
