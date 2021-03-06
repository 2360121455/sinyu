package cn.sinyu.energy.portal.VO;

import cn.sinyu.energy.portal.model.MainData;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class MainDataVO implements Serializable {
    private String areaName;
    private String getTime;
    private String position;
    private List<MainData> mainDataList;
}
