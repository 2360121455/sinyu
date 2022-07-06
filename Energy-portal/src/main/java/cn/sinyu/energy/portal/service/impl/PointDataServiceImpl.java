package cn.sinyu.energy.portal.service.impl;

import cn.sinyu.energy.portal.VO.PointDataVO;
import cn.sinyu.energy.portal.dto.PointDataDTO;
import cn.sinyu.energy.portal.mapper.MenuMapper;
import cn.sinyu.energy.portal.mapper.PointDataMapper;
import cn.sinyu.energy.portal.model.Menu;
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
    @Autowired
    MenuMapper menuMapper;

    @Override
    public PointDataVO getData(PointDataDTO pointDataDTO) {
        PointDataVO pointDataVO = new PointDataVO();
        Date date = new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //根据Location_code查询数据
        QueryWrapper<PointData> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("location_code",pointDataDTO.getLocationCode());
        List<PointData> pointDataList = pointDataMapper.selectList(queryWrapper);
        //根据menu_code查询节点数据
        Menu menu = menuMapper.selectById(pointDataDTO.getMenuCode());
        //将数据插入pointDataVO对象中
        pointDataVO.setGetTime(sdf.format(date));
        pointDataVO.setAreaName(pointDataDTO.getMenuName());
        pointDataVO.setPosition(menu.getFullName());
        pointDataVO.setPointDataList(pointDataList);
        return pointDataVO;
    }
}
