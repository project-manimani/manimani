package com.manimani.web.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manimani.web.dao.*;

@RestController
public class MainRestController {
    
    @Autowired
    private MemberDAO dao;

}