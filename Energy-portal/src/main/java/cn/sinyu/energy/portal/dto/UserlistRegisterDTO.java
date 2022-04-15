package cn.sinyu.energy.portal.dto;

import lombok.Data;

import java.io.Serializable;
//用户注册登录参数封装类
@Data
public class UserlistRegisterDTO implements Serializable {
    private String username;
    private String account;
    private String password;
    private String pwtrue;
}
