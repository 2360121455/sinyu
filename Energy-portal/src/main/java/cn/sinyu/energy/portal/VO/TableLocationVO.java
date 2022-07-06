package cn.sinyu.energy.portal.VO;

import cn.sinyu.energy.portal.model.Location;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TableLocationVO implements Serializable {
    private List<Location> locationList;
    private List<String> types;
}
