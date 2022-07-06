package cn.sinyu.energy.portal.VO;

import cn.sinyu.energy.portal.model.PointData;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PointDataVO implements Serializable {
    private String areaName;
    private String getTime;
    private String position;
    private List<PointData> pointDataList;
}
