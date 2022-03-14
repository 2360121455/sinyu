package cn.sinyu.energy.portal.util;

import org.springframework.util.DigestUtils;

/**
 * 密码加密
 */
public class PasswordUtils {

    public static String encode(String rawPassword){
        return DigestUtils.md5DigestAsHex(rawPassword.getBytes());
    }
}
