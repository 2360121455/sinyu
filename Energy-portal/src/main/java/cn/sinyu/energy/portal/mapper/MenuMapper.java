package cn.sinyu.energy.portal.mapper;

import cn.sinyu.energy.portal.VO.MenuVO;
import cn.sinyu.energy.portal.model.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zcd
 * @since 2022-03-24
 */
@Repository
public interface MenuMapper extends BaseMapper<Menu> {

    List<MenuVO> findByMenuCode(String menuCode);

    String findParent(String menuCode);

}
