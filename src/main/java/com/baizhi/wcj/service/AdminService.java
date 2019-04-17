package com.baizhi.wcj.service;

import com.baizhi.wcj.entity.Admin;

public interface AdminService {
    Admin login(String username, String password);
    void regist(Admin admin);
}
