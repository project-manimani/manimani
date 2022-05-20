package com.manimani.web.vo;

import lombok.Getter;
import lombok.Setter;

/*
	gmid int AI PK 
	gid int 
	account varchar(100) 
	admin int
 */

@Getter
@Setter
public class Group_memberVO {
	private int gmid;
	private int gid;
	private String account;
	private int admin;
}
