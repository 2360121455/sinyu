package cn.sinyu.energy.portal.dto;

import lombok.Data;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
//用户注册登录参数封装类
@Data
public class UserlistRegisterDTO implements Serializable {
    @Size(min = 2,max = 8,message = "注册失败，昵称为2-8个字符")
    private String username;
    @Pattern(regexp = "/^[a-zA-Z0-9_-]{8,16}$/",message = "注册失败，账号必须为8-16位（字母，数字，下划线，减号）")
    private String account;
    @Pattern(regexp = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,16}$",message = "注册失败，密码必须为数字和字母的组合")
    private String password;
}
