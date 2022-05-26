package com.manimani.web.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.manimani.web.vo.MGroupVO;
import com.manimani.web.vo.MatchingVO;
import com.manimani.web.vo.MemberVO;
import com.manimani.web.vo.MyGroupAllInfoVO;

@Service
public interface MatchingService {
	//MyGroup userList
	public List<MyGroupAllInfoVO> matchingMyGroupUserList(String account);
	//userDetail
	public MemberVO matchingUserDetail(int uid);
	//match MyManimani
	public int matchingMymanimani(String account,int uid);
	//myGroupInfo
	public MGroupVO myGroupInfo(String account);
}
