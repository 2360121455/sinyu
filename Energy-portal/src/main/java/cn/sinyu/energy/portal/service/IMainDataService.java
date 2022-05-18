package cn.sinyu.energy.portal.service;

import cn.sinyu.energy.portal.VO.MainDataVO;
import cn.sinyu.energy.portal.dto.MainDataDTO;
import cn.sinyu.energy.portal.model.MainData;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zcd
 * @since 2022-05-17
 */
public interface IMainDataService extends IService<MainData> {

    MainDataVO getData(MainDataDTO mainDataDTO);

}
