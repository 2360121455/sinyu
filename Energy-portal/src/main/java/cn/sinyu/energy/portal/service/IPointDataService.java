package cn.sinyu.energy.portal.service;

import cn.sinyu.energy.portal.VO.PointDataVO;
import cn.sinyu.energy.portal.dto.PointDataDTO;
import cn.sinyu.energy.portal.model.PointData;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zcd
 * @since 2022-05-13
 */
public interface IPointDataService extends IService<PointData> {

    PointDataVO getData(PointDataDTO pointDataDTO);

}
