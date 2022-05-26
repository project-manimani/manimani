package com.manimani.web.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.manimani.web.vo.LetterVO;

@Mapper
public interface LetterMapper {
	/* 편지 전체리스트 test */
	@Select("SELECT * FROM letter")
	public List<LetterVO> letterList();
	
	/* 받은편지 리스트, 받는 사람이 session과 같을때 */
	@Select("SELECT * FROM letter "
			+"WHERE receiver =#{receiver} "
			+"AND gid=#{gid} ")
	public List<LetterVO> receiveList(String receiver);
	
	/* 보낸편지 리스트, 보내는 사람이 session과 같을때 */
	@Select("SELECT * FROM letter "
			+"WHERE sender=#{sender} "
			+"AND gid=#{gid}")
	public List<LetterVO> sendList(String sender);
	
	/* 편지페이징 */
	@Select("SELECT CEIL(COUNT(*) / 10.0) "
			+"FROM letter "
			+"WHERE gid=#{gid} AND account=#{account}")
	public int letterTotalPage(Map map);
	
	/* 편지갯수 */
	@Select("SELECT COUNT(*) "
			+"FROM letter "
			+"WHERE gid=#{gid} AND account=#{account}")
	public int letterCount(Map map);
	
}
