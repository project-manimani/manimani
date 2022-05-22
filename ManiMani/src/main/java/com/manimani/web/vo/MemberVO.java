package com.manimani.web.vo;

import javax.validation.constraints.*;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MemberVO {
    
    private int uid;
    private String account;
    private String password;
    private String email;
}
