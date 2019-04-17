package com.baizhi.wcj;

import com.baizhi.wcj.dao.AdminMapper;
import com.baizhi.wcj.dao.EmployeesMapper;
import com.baizhi.wcj.entity.Admin;
import com.baizhi.wcj.entity.AdminExample;
import com.baizhi.wcj.entity.Employees;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootEmsApplication.class)
public class SpringbootEmsApplicationTests {
    @Resource
    private AdminMapper adminMapper;
    @Resource
    private EmployeesMapper employeesMapper;
    @Test
    public void contextLoads() {
        AdminExample example = new AdminExample();
        example.createCriteria().andNameEqualTo("wxc").andNameEqualTo("123456");
        List<Admin> admins = adminMapper.selectByExample(example);
        for (Admin admin : admins) {
            System.out.println(admin);
        }
    }
    @Test
    public void testEmp(){
        Employees employees = employeesMapper.selectByPrimaryKey(1);
        System.out.println(employees);
    }

}
