package cn.sinyu.energy.portal.controller;


import cn.sinyu.energy.portal.VO.PointDataVO;
import cn.sinyu.energy.portal.dto.PointDataDTO;
import cn.sinyu.energy.portal.service.IPointDataService;
import cn.sinyu.energy.portal.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zcd
 * @since 2022-05-13
 */
@RestController
@RequestMapping("/portal/pointData")
public class PointDataController {

    @Autowired
    IPointDataService iPointDataService;

    @PostMapping("/data")
    public R<PointDataVO> getPointData(PointDataDTO pointDataDTO){
        return R.ok(iPointDataService.getData(pointDataDTO));
    }
}
