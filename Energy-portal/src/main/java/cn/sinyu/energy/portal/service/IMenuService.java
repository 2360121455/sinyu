package cn.sinyu.energy.portal.service;

import cn.sinyu.energy.portal.model.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zcd
 * @since 2022-03-24
 */
public interface IMenuService extends IService<Menu> {

    List<Menu> getMenu();
}
