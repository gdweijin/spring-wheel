package com.lenovo.lurp.user.service;

import com.lenovo.lurp.mybatis.model.User;

/**
 * Created by Ming on 2015/11/30.
 */
public interface UserServiceI {
    String register(User user);
    User getUserByAccount(String account);
}
