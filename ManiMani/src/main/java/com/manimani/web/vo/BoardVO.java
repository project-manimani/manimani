package com.manimani.web.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardVO {
    
    int bid;
    String account;
    String title;
    String content;
    int visits;
    String regdate;
    int view;
}
