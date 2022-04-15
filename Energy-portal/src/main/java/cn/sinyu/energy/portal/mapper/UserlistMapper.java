package cn.sinyu.energy.portal.mapper;

import cn.sinyu.energy.portal.VO.UserLoginVO;
import cn.sinyu.energy.portal.model.Userlist;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zcd
 * @since 2022-03-03
 */
@Repository
public interface UserlistMapper extends BaseMapper<Userlist> {
    Userlist findByAccount(String account);

    UserLoginVO findVOByAccount(String account);
}
