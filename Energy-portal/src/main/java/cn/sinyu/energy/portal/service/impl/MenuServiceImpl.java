package cn.sinyu.energy.portal.service.impl;

import cn.sinyu.energy.portal.VO.MenuVO;
import cn.sinyu.energy.portal.dto.MenusDTO;
import cn.sinyu.energy.portal.mapper.MenuMapper;
import cn.sinyu.energy.portal.model.Menu;
import cn.sinyu.energy.portal.service.IMenuService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zcd
 * @since 2022-03-24
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

    @Autowired
    MenuMapper menuMapper;

    @Override
    public List<MenuVO> getMenu(MenusDTO menusDTO) {
        return menuMapper.findByMenuCode(menusDTO.getMenuCode());
    }

    @Override
    public List<MenuVO> getMenuFacility(String menuCode){
        List<MenuVO> menuVOS = menuMapper.findByMenuCode(menuCode);
        for (MenuVO menus: menuVOS) {
            menus.setMenuVOS(menuMapper.findByMenuCode(menus.getMenuCode()));
        }
        return menuVOS;
    }

    @Override
    public List<Menu> findMenus() {
        QueryWrapper<Menu> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("menu_level",0);
        List<Menu> menuList = menuMapper.selectList(queryWrapper);
        return menuList;
    }

}
