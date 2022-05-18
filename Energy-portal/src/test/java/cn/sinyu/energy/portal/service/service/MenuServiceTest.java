package cn.sinyu.energy.portal.service.service;

import cn.sinyu.energy.portal.VO.MenuVO;
import cn.sinyu.energy.portal.dto.MenusDTO;
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
        MenusDTO menusDTO = new MenusDTO();
        menusDTO.setMenuCode("01");
        List<MenuVO> menuList = iMenuService.getMenu(menusDTO);
        System.out.println(menuList);
    }
}
