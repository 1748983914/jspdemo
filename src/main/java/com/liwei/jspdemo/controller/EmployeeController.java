package com.liwei.jspdemo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liwei.jspdemo.bean.Employee;
import com.liwei.jspdemo.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 邢立伟20165939
 * @create 2020/3/24 - 10:44
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeMapper employeeMapper;
    @RequestMapping("/get")
    public String aa(Model model){
        List<Employee> employees = employeeMapper.selectList(new QueryWrapper<>());
        model.addAttribute("1","1");
        return "jspdemo";
    }
}
