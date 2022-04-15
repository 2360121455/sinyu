package cn.sinyu.energy.portal.controller;


import cn.sinyu.energy.portal.dto.UserlistRegisterDTO;
import cn.sinyu.energy.portal.ex.InvalidParameterException;
import cn.sinyu.energy.portal.service.IUserlistService;
import cn.sinyu.energy.portal.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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
    IUserlistService userService;

    /**
     * 注册
     * @param userlistRegisterDTO
     * @return
     */
    @PostMapping("/register")
    public R<Void> Register(@Valid UserlistRegisterDTO userlistRegisterDTO, BindingResult bindingResult) {
        //验证格式
        if(bindingResult.hasErrors()){
            String errorMessage = bindingResult.getFieldError().getDefaultMessage();
            throw new InvalidParameterException(errorMessage);
        }
        userService.Register(userlistRegisterDTO);
        return R.ok().setMessage("注册成功");
    }

}
