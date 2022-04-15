package cn.sinyu.energy.portal.controller;


import cn.sinyu.energy.portal.model.Menu;
import cn.sinyu.energy.portal.service.IMenuService;
import cn.sinyu.energy.portal.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zcd
 * @since 2022-03-24
 */
@RestController
@RequestMapping("/portal/menu")
public class MenuController {

    @Autowired
    IMenuService menuService;

    @GetMapping("")
    public R<List<Menu>> getMenuList(){
        List<Menu> menuList = menuService.getMenu();
        return R.ok(menuList);
    }
}
