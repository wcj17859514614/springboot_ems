package com.baizhi.wcj.serviceimpl;

import com.baizhi.wcj.dao.AdminMapper;
import com.baizhi.wcj.entity.Admin;
import com.baizhi.wcj.entity.AdminExample;
import com.baizhi.wcj.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin login(String username, String password) {
        AdminExample example = new AdminExample();
        example.createCriteria().andNameEqualTo(username).andNameEqualTo(password);
        List<Admin> admins = adminMapper.selectByExample(example);
        return admins.get(0);
    }

    @Override
    public void regist(Admin admin) {

    }

}
