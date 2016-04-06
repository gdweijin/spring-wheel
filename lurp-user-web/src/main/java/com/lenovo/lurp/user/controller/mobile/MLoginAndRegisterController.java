package com.lenovo.lurp.user.controller.mobile;

import com.alibaba.fastjson.JSON;
import com.lenovo.lurp.mybatis.dao.UserMapper;
import com.lenovo.lurp.mybatis.model.User;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ming on 2016/1/24.
 */
@RestController
@RequestMapping("/wheel/user")
public class MLoginAndRegisterController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/testShowUser/{id}")
    public User getUserById(@PathVariable String id){
        Integer userId = Integer.valueOf(id);
        System.out.println(userId   );
        Subject subject = SecurityUtils.getSubject();
        System.out.println("000000000000000"+subject);
        System.out.println("--------------tt----------------------");
        System.out.println("------------------------------------");
        System.out.println("-----------------eeee-------------------");
        System.out.println("--------------------------------");
        System.out.println("------------------------------------");
        User user = userMapper.selectByPrimaryKey(userId);
        System.out.println(JSON.toJSONString(user));
        return  user;
    }

}
