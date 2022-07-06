package cn.sinyu.energy.portal;

import cn.sinyu.energy.portal.VO.UserLoginVO;
import cn.sinyu.energy.portal.dto.AddLocationDTO;
import cn.sinyu.energy.portal.mapper.MainDataMapper;
import cn.sinyu.energy.portal.mapper.MenuMapper;
import cn.sinyu.energy.portal.mapper.PointDataMapper;
import cn.sinyu.energy.portal.mapper.UserlistMapper;
import cn.sinyu.energy.portal.model.Userlist;
import cn.sinyu.energy.portal.service.impl.LocationServiceImpl;
import cn.sinyu.energy.portal.service.impl.UserlistServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MybatisPlusTests {

    @Autowired
    UserlistMapper ulmapper;
    @Autowired
    UserlistServiceImpl userService;
    @Autowired
    MenuMapper menuMapper;
    @Autowired
    PointDataMapper pointDataMapper;
    @Autowired
    MainDataMapper mainDataMapper;
    @Autowired
    LocationServiceImpl locationService;

    @Test
    void insert(){
        AddLocationDTO addLocationDTO = new AddLocationDTO();
        addLocationDTO.setLocationName("A区");
        locationService.addLocation(addLocationDTO);
    }

    @Test
    void delete(){
        int rows = ulmapper.deleteById(1);
        System.out.println("rows = "+rows);
    }

    @Test
    void update(){
        Userlist user = new Userlist();
        user.setUserCode("1");
        user.setUserName("黑熊精");
        ulmapper.updateById(user);
    }

    @Test
    void select(){
        System.out.println(locationService.findson("01","0","A区"));
    }

    @Test
    void a(){
        String account = "2360121455";
        UserLoginVO userLoginVO = userService.Login(account);
        System.out.println(userLoginVO);
    }
}
