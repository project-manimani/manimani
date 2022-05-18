package com.manimani.web.vo;

import lombok.Getter;
import lombok.Setter;

/*
Table: matching

mid int AI PK 
gid int 
uid1 varchar(200) 
uid2 varchar(200) 
view int
 */
@Setter
@Getter
public class MatchingVO {

	private int mid;//PK , auto_increment
	private int gid;//groupID
	private int uid1,uid2;
	private int view;// default: 1(출력)
}
