package cn.sinyu.energy.portal.service.impl;

import cn.sinyu.energy.portal.VO.MainDataVO;
import cn.sinyu.energy.portal.dto.MainDataDTO;
import cn.sinyu.energy.portal.mapper.MainDataMapper;
import cn.sinyu.energy.portal.model.MainData;
import cn.sinyu.energy.portal.service.IMainDataService;
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
 * @since 2022-05-17
 */
@Service
public class MainDataServiceImpl extends ServiceImpl<MainDataMapper, MainData> implements IMainDataService {

    @Autowired
    MainDataMapper mainDataMapper;

    @Override
    public MainDataVO getData(MainDataDTO mainDataDTO) {
        MainDataVO mainDataVO = new MainDataVO();
        Date date = new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        QueryWrapper<MainData> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("menu_id",mainDataDTO.getMenuId());
        List<MainData> mainDataList = mainDataMapper.selectList(queryWrapper);
        mainDataVO.setGetTime(sdf.format(date));
        mainDataVO.setAreaName(mainDataDTO.getMenuName());
        mainDataVO.setMainDataList(mainDataList);
        return mainDataVO;
    }
}
