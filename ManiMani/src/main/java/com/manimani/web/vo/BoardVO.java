package com.manimani.web.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardVO {
    
    private int bid;
    private int gid;
    private String account;
    private String title;
    private String content;
    private int visits;
    private String regdate;
    private int view;
}
