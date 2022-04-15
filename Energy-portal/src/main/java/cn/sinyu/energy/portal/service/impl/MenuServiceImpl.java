package cn.sinyu.energy.portal.service.impl;

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
    public List<Menu> getMenu() {
        QueryWrapper<Menu> queryWrapper = new QueryWrapper<>();
        return menuMapper.selectList(queryWrapper);
    }
}
