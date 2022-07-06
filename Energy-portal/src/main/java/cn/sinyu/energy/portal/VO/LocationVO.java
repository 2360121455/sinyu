package cn.sinyu.energy.portal.VO;

import cn.sinyu.energy.portal.model.Location;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class LocationVO implements Serializable {
    private String locationCode;
    private String locationLevel;
    private String locationName;
    private List<Location> locationList;
}
