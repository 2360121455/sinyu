package cn.sinyu.energy.portal;

import cn.sinyu.energy.portal.VO.UserLoginVO;
import cn.sinyu.energy.portal.mapper.MenuMapper;
import cn.sinyu.energy.portal.mapper.UserlistMapper;
import cn.sinyu.energy.portal.model.Menu;
import cn.sinyu.energy.portal.model.Userlist;
import cn.sinyu.energy.portal.service.impl.UserlistServiceImpl;
import cn.sinyu.energy.portal.util.PasswordUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.UUID;

@SpringBootTest
@Slf4j
public class MybatisPlusTests {

    @Autowired
    UserlistMapper ulmapper;
    @Autowired
    UserlistServiceImpl userService;
    @Autowired
    MenuMapper menuMapper;

    @Test
    void insert(){
        Userlist user = new Userlist();
        user.setUserCode(UUID.randomUUID().toString());
        user.setUserName("大老黑");
        user.setAccount("2360121455");
        user.setPassword(PasswordUtils.encode("123456789"));
        user.setRoleCode("0");
        int rows = ulmapper.insert(user);
        log.debug("rows = "+rows);
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
        QueryWrapper<Menu> queryWrapper = new QueryWrapper<>();
        List<Menu> menuList = menuMapper.selectList(queryWrapper);
        System.out.println(menuList);
    }

    @Test
    void a(){
        String account = "2360121455";
        UserLoginVO userLoginVO = userService.Login(account);
        System.out.println(userLoginVO);
    }
}
