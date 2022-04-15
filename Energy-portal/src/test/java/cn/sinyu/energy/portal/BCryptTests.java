package cn.sinyu.energy.portal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class BCryptTests {

    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Test
    void a(){
        String rawPassword = "1234";
        String encodePassword = passwordEncoder.encode(rawPassword);
        System.out.println(encodePassword);
    }

    @Test
    void matches(){
        String rawPassword = "1234";
        String encodePassword = "$2a$10$zBS5DMZVIh2atIJFPzMiQuyNGvn.cwj6y8M1QCakbkFWBBOU1t8du";
        boolean result = passwordEncoder.matches(rawPassword,encodePassword);
        System.out.println(result);
    }
}
