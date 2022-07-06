package cn.sinyu.energy.portal.VO;

import cn.sinyu.energy.portal.model.MainData;
import cn.sinyu.energy.portal.model.PointData;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TableVO implements Serializable {
    private List<PointData> pointDataList;
    private List<MainData> mainDataList;
}
