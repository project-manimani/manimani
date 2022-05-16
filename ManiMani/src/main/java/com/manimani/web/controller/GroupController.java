package com.manimani.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import com.manimani.web.dao.*;
import com.manimani.web.vo.*;

@Controller
@RequestMapping("/group")
public class GroupController {

    @Autowired
    private UsersDAO dao;
    
    @RequestMapping("/group")
    public String group() {
        return "group/group";
    }
}