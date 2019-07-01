package com.ts.springboot.controller;

import com.ts.springboot.bean.User;
import com.ts.springboot.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StuController {
    @Autowired
    private StuService stuService;

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        User stu = stuService.getById(1);
        return stu.getName();
    }

}
