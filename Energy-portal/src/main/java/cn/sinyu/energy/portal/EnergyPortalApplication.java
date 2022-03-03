package cn.sinyu.energy.portal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.sinyu.Energy.portal.mapper")
public class EnergyPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnergyPortalApplication.class, args);
    }

}
