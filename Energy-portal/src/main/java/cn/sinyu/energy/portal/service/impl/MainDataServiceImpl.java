package cn.sinyu.energy.portal.service.impl;

import cn.sinyu.energy.portal.VO.MainDataVO;
import cn.sinyu.energy.portal.dto.MainDataDTO;
import cn.sinyu.energy.portal.mapper.MainDataMapper;
import cn.sinyu.energy.portal.mapper.MenuMapper;
import cn.sinyu.energy.portal.model.MainData;
import cn.sinyu.energy.portal.model.Menu;
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
    @Autowired
    MenuMapper menuMapper;

    /**
     * 点击节点查询数据
     * @param mainDataDTO
     * @return
     */
    @Override
    public MainDataVO getData(MainDataDTO mainDataDTO) {
        MainDataVO mainDataVO = new MainDataVO();
        //时间转为字符串
        Date date = new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        QueryWrapper<MainData> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("location_code",mainDataDTO.getLocationCode());
        List<MainData> mainDataList = mainDataMapper.selectList(queryWrapper);
        Menu menu = menuMapper.selectById(mainDataDTO.getMenuCode());
        mainDataVO.setGetTime(sdf.format(date));
        mainDataVO.setAreaName(mainDataDTO.getMenuName());
        mainDataVO.setPosition(menu.getFullName());
        mainDataVO.setMainDataList(mainDataList);
        return mainDataVO;
    }
}
