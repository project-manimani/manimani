package com.manimani.web.vo;

import lombok.Getter;
import lombok.Setter;
import java.util.*;

/*
	gid int AI PK 
	gname varchar(100) 
	code varchar(200) 
	description varchar(1000) 
	regdate datetime
 */

@Getter
@Setter
public class MGroupVO {
	private int gid;
	private String gname;
	private String code;
	private String description;
	private Date regdate;
	private Date enddate;
}
