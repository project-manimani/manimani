package com.manimani.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import com.manimani.web.dao.*;
import com.manimani.web.vo.*;

@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    private UsersDAO dao;
    
    @GetMapping("/login")
    public String login(Model model) {
        
        model.addAttribute("main_content", "main/login");
        return "main/main_template";
    }
}