package com.ts.springboot.dao;

import com.ts.springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StuMapper {
    public User selectById(int id);
}
