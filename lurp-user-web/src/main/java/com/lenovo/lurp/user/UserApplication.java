package com.lenovo.lurp.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Ming on 2015/11/4.
 */

@SpringBootApplication
public class UserApplication {
   public static void main(String[] args) {
       SpringApplication.run(new String[]{
               "classpath:/config/spring-mvc.xml",
               "classpath:/config/spring-mybatis.xml",
               "classpath:/config/spring-i18n.xml",
               "classpath:/config/spring-shiro.xml",
               "classpath:/config/captcha.xml"
       }, args);
   }
}