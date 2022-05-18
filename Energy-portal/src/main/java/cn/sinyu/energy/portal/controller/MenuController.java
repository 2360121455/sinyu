package cn.sinyu.energy.portal.controller;


import cn.sinyu.energy.portal.VO.MenuVO;
import cn.sinyu.energy.portal.dto.MenusDTO;
import cn.sinyu.energy.portal.model.Menu;
import cn.sinyu.energy.portal.service.IMenuService;
import cn.sinyu.energy.portal.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/menus")
    public R<List<MenuVO>> getMenuList(MenusDTO menusDTO){
        List<MenuVO> menuList = menuService.getMenu(menusDTO);
        return R.ok(menuList);
    }

    @PostMapping("/menusFacility")
    public R<List<MenuVO>> getMenuFacilityList(String menuCode){
        List<MenuVO> menuList = menuService.getMenuFacility(menuCode);
        return R.ok(menuList);
    }

    @GetMapping("/findmenus")
    public R<List<Menu>> findMenus(){
        List<Menu> menuList = menuService.findMenus();
        return R.ok(menuList);
    }
}
