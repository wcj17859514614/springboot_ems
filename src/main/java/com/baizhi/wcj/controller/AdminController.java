package com.baizhi.wcj.controller;

import com.baizhi.wcj.entity.Admin;
import com.baizhi.wcj.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("login")
    public String login(String username,String password){
        Admin admin = adminService.login(username, password);
        if(admin!=null){
            return "index";
        } else {
            return "error";
        }

    }
}
