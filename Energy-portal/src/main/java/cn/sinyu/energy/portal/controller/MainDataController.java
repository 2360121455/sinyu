package cn.sinyu.energy.portal.controller;


import cn.sinyu.energy.portal.VO.MainDataVO;
import cn.sinyu.energy.portal.dto.MainDataDTO;
import cn.sinyu.energy.portal.service.IMainDataService;
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
 * @since 2022-05-17
 */
@RestController
@RequestMapping("/portal/mainData")
public class MainDataController {

    @Autowired
    IMainDataService iMainDataService;

    @PostMapping("/data")
    public R<MainDataVO> getMainData(MainDataDTO mainDataDTO){
        return R.ok(iMainDataService.getData(mainDataDTO));
    }

}
