package com.manimani.web.vo;
//matching_myGroup 모든 정보' 출력용

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class MyGroupAllInfoVO {

	private int uid,gid,mid,view;
	private String account,email,gname,code,description;
	private Date regdate,enddate;	
}
