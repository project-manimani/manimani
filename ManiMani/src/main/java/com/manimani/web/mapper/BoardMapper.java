package com.manimani.web.mapper;

import java.util.*;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.manimani.web.vo.*;

@Mapper
public interface BoardMapper {
	
    /*private int bid;
    private String account;
    private String title;
    private String content;
    private int visits;
    private String regdate;
    private int view;*/
	
	// 게시판 리스트
    @Select("SELECT bid,gid,account,title,content,regdate,visits "
    		+ "FROM (SELECT bid,gid,account,title,content,regdate,visits,rownum as num "
    				+ "FROM (SELECT /*+ INDEX_DESC(board board_bid_pk)*/bid,gid,account,title,content,regdate,visits "
    						+ "FROM board "
    						+ "WHERE gid=#{gid})) "
    		+ "WHERE num BETWEEN #{start} AND #{end}")
	public List<BoardVO> boardList(Map map);
    
    // 게시판 개수
    @Select("SELECT COUNT(*) FROM board")
    public int boardCount();
    
    // 게시판 총페이지 개수
    @Select("SELECT CEIL(COUNT(*)/10.0 FROM board")
    public int boardTotalPage();
    
    // 게시판 입력(글쓰기)
    @Insert("INSERT INTO board "
    		+ "VALUES (board_bid_seq.nextval,#{gid},#{account},#{title},#{content},SYSDATE,0")
    public void boardInsertData(BoardVO vo);
    
    // 게시판 조회수 증가
    @Update("UPDATE board SET "
    		+ "visits=visits+1 "
    		+ "WHERE bid=#{bid}")
    public void boardVisitIncrement(int bid);
    
    // 게시판 상세보기
    @Select("SELECT bid,gid,account,title,content,regdate "
    		+ "FROM board "
    		+ "WHERE bid=#{bid}")
    public BoardVO boardDetailData(int bid);
    
}