package com.ts.springboot.service.impl;

import com.ts.springboot.bean.User;
import com.ts.springboot.dao.StuMapper;
import com.ts.springboot.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class StuServiceImpl implements StuService,Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Autowired
    private StuMapper stuMapper;
    @Override
    public User getById(int id) {
        // TODO Auto-generated method stub
        User user = stuMapper.selectById(id);
        return user;
    }

}
