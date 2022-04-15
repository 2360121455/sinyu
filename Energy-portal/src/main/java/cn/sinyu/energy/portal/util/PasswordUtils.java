package cn.sinyu.energy.portal.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 密码加密
 */
public class PasswordUtils {

    private static BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public static String encode(String rawPassword){
        //return DigestUtils.md5DigestAsHex(rawPassword.getBytes());
        return "{bcrypt}" + passwordEncoder.encode(rawPassword);
    }
}
