package com.manimani.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import javax.servlet.http.HttpSession;

import com.manimani.web.dao.*;
import com.manimani.web.service.*;
import com.manimani.web.vo.*;

@Controller
public class MainController {

    @Autowired
    private MemberService service;
    
    @GetMapping("/login")
    public String login(Model model, HttpSession session) {
        
        if (session.getAttribute("userID") != null) {
            return "redirect:group/main";
        }
        model.addAttribute("main_content", "main/login");
        return "main/main_template";
    }
    
    @PostMapping("/login_ok")
    public String login_ok(String id, String password, Model model, HttpSession session) {
        System.out.println(service.login(id, password));
        if (service.login(id, password) == id) {
            session.setAttribute("userID", id);
        } else {
            return "redirect:login";
        }
        
        return "redirect:group/main";
    }
}