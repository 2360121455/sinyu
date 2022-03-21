package cn.sinyu.energy.portal.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserlistLoginDTO implements Serializable {
    private String account;
    private String password;
}
