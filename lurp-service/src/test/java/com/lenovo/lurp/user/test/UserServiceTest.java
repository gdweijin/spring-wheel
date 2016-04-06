package com.lenovo.lurp.user.test;

import com.alibaba.fastjson.JSON;
import com.lenovo.lurp.mybatis.dao.UserMapper;
import com.lenovo.lurp.mybatis.model.User;
import com.lenovo.lurp.shiro.RetryLimitedCredentials;
import com.lenovo.lurp.user.service.UserServiceI;
import org.junit.Test;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;


/**
 * Created by Ming on 2015/11/30.
 */
public class UserServiceTest extends AbstractServiceTests {

    @Autowired
    private UserServiceI userServiceI ;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testI(){
        userMapper.selectAll();
    }

    @Test @Rollback(false)
    public void test_register(){
        User user = new User("631663525@qq.com","123456","Ming");
        userServiceI.register(user);
    }

    @Test
    public void test_match(){
        WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
        webApplicationContext.getServletContext();
        RetryLimitedCredentials a = (RetryLimitedCredentials)webApplicationContext.getBean("credentialsMatcher");
        //a.doCredentialsMatch();

    }
    @Test
    public void test_getUserByAccount(){
        System.out.println(JSON.toJSONString(userServiceI.getUserByAccount("631663525@qq.com")));
    }

}
