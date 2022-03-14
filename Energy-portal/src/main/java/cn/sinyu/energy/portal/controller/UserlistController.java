package cn.sinyu.energy.portal.controller;


import cn.sinyu.energy.portal.dto.UserlistRegisterDTO;
import cn.sinyu.energy.portal.ex.AccountDuplicateException;
import cn.sinyu.energy.portal.ex.InsertException;
import cn.sinyu.energy.portal.ex.UsernameDuplicateException;
import cn.sinyu.energy.portal.service.impl.UserlistServiceImpl;
import cn.sinyu.energy.portal.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zcd
 * @since 2022-03-03
 */
@RestController
@RequestMapping("/portal/userlist")
public class UserlistController {
    //装配业务层对象
    @Autowired
    UserlistServiceImpl userService;

    /**
     * 注册
     * @return
     */
    //localhost:8080/portal/userlist/register/user?username=大老黑&account=1&password=2
    @RequestMapping("/register/user")
    public R Register(UserlistRegisterDTO userlistRegisterDTO){
        R r = new R();
        try{
            userService.Register(userlistRegisterDTO);
            r.setState(1);
            r.setMessage("注册成功!");
        }catch (AccountDuplicateException e){
            r.setState(2);
            r.setMessage("注册失败！账户已经存在!");
        }catch (UsernameDuplicateException e){
            r.setState(3);
            r.setMessage("注册失败！用户名已经存在!");
        }catch (InsertException e){
            r.setState(4);
            r.setMessage("注册失败！服务器繁忙，请稍后再试!");
        }
        return r;
    }
}
