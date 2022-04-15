package cn.sinyu.energy.portal.VO;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class UserLoginVO implements Serializable {
    private String userCode;
    private String userName;
    private String account;
    private String password;
    private String state;
    private List<permissionVO> permissions;
}
