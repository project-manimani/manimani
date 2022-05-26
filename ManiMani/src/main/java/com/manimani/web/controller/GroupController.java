package com.manimani.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import javax.servlet.http.HttpSession;

import com.manimani.web.dao.*;
import com.manimani.web.vo.*;
import com.manimani.web.service.*;

@Controller
@RequestMapping("/group")
public class GroupController {
    @Autowired
    private MGroupService service;
    
    @RequestMapping("/main")
    public String group(Model model) {
        List<MGroupVO> list = service.mGroupListData();
        model.addAttribute("group_content", "group/main");
        model.addAttribute("list",list);
        model.addAttribute("id","임시아이디");
        return "group/group_template";  
    }
    
    @RequestMapping("/insertgroup")
    public String insertGroup(HttpSession session, MGroupVO vo) {
    	String id = (String) session.getAttribute("id");
    	String code = (String)vo.getCode();
    	service.groupInsert(id,code,0);
    	
    	return "redirect:/main";
    }
   
}