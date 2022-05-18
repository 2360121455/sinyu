package cn.sinyu.energy.portal.service.impl;

import cn.sinyu.energy.portal.VO.PointDataVO;
import cn.sinyu.energy.portal.dto.PointDataDTO;
import cn.sinyu.energy.portal.mapper.PointDataMapper;
import cn.sinyu.energy.portal.model.PointData;
import cn.sinyu.energy.portal.service.IPointDataService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zcd
 * @since 2022-05-13
 */
@Service
public class PointDataServiceImpl extends ServiceImpl<PointDataMapper, PointData> implements IPointDataService {

    @Autowired
    PointDataMapper pointDataMapper;

    @Override
    public PointDataVO getData(PointDataDTO pointDataDTO) {
        PointDataVO pointDataVO = new PointDataVO();
        Date date = new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        QueryWrapper<PointData> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("menu_id",pointDataDTO.getMenuId());
        List<PointData> pointDataList = pointDataMapper.selectList(queryWrapper);
        pointDataVO.setGetTime(sdf.format(date));
        pointDataVO.setAreaName(pointDataDTO.getMenuName());
        pointDataVO.setPointDataList(pointDataList);
        return pointDataVO;
    }
}
