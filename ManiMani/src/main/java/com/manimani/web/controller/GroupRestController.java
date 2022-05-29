package com.manimani.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manimani.web.service.MGroupService;

@Controller
public class GroupRestController {
	@Autowired
    private MGroupService service;
	
	@GetMapping(value="group/main/groupfinding" ,produces = "text/plain;charset=utf-8")
	public String findingGroup(String groupCode) {
		String groupname = service.findingGroup(groupCode);
		if(groupname==null) {
			groupname="해당하는 그룹이 없습니다! 코드를 다시 확인해 주시겠어요?";
		}
		return groupname;
	}
}
