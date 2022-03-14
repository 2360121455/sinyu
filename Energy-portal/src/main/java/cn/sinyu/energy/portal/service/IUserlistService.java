package cn.sinyu.energy.portal.service;

import cn.sinyu.energy.portal.dto.UserlistRegisterDTO;
import cn.sinyu.energy.portal.model.Userlist;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zcd
 * @since 2022-03-03
 */
public interface IUserlistService extends IService<Userlist> {
    //注册
    void Register(UserlistRegisterDTO userlistRegisterDTO);
}
