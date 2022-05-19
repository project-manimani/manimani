package com.manimani.web.vo;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
/*
lid int AI PK 
gid int 
sender varchar(34) 
receiver varchar(34) 
content varchar(200) 
regdate datetime 
view int
*/

@Setter
@Getter
public class LetterVO {
    private int lid;
    private int gid;
    private String sender;
    private String receiver;
    private String content;
    private Date regdate;
    private int view;
}
