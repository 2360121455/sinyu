package cn.sinyu.energy.portal.controller;


import cn.sinyu.energy.portal.dto.UserlistRegisterDTO;
import cn.sinyu.energy.portal.service.impl.UserlistServiceImpl;
import cn.sinyu.energy.portal.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zcd
 * @since 2022-03-03
 */
@RestController
@RequestMapping("/portal/userlist")
public class UserlistController extends GlobalExceptionHandler {
    //装配业务层对象
    @Autowired
    UserlistServiceImpl userService;

    /**
     * 注册
     *
     * @return
     */
    //localhost:8080/portal/userlist/register/user?username=大老黑&account=1&password=2
    @RequestMapping("/register/user")
    public R Register(UserlistRegisterDTO userlistRegisterDTO) {
        userService.Register(userlistRegisterDTO);
        return new R(1,"注册成功！");
    }


}
