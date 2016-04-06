package com.lenovo.lurp.user.model;

import org.hibernate.validator.constraints.NotBlank;

import com.lenovo.lurp.mybatis.model.User;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by Ming on 2015/12/19.
 */
public class UserForm extends User{

    @Size(max=7,message="{max_captcha_length}")
    @Pattern(regexp = "^[A-Za-z_0-9]*$", message="{captcha_require}")
    private String captcha;

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}
