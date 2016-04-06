package com.lenovo.lurp.mybatis.dao;

import com.lenovo.lurp.mybatis.model.User;

import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
    User getUserByAccount(String account);
}