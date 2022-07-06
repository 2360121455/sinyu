package cn.sinyu.energy.portal.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PointDataDTO implements Serializable {
    private String locationCode;
    private String menuName;
    private String menuCode;
}
