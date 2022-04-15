package cn.sinyu.energy.portal.service.service;

import cn.sinyu.energy.portal.model.Menu;
import cn.sinyu.energy.portal.service.IMenuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MenuServiceTest {

    @Autowired
    IMenuService iMenuService;

    @Test
    void getMenuList(){
        List<Menu> menuList = iMenuService.getMenu();
        System.out.println(menuList);
    }
}
