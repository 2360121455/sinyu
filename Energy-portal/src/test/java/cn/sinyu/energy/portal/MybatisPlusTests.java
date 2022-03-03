package cn.sinyu.energy.portal;

import cn.sinyu.energy.portal.mapper.UserlistMapper;
import cn.sinyu.energy.portal.model.Userlist;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MybatisPlusTests {

    @Autowired
    UserlistMapper ulmapper;

    @Test
    void insert(){
        Userlist user = new Userlist();
        user.setUserCode("1");
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
        user.setUserName("黑瞎子");
        ulmapper.updateById(user);
    }

    @Test
    void select(){
//        QueryWrapper<Userlist> qw = new QueryWrapper<>();
//        qw.eq("user_name","黑瞎子");
//        List<Userlist> ul = ulmapper.selectList(qw);
        Userlist ul = ulmapper.selectById(5);
        System.out.println(ul);
    }
}
