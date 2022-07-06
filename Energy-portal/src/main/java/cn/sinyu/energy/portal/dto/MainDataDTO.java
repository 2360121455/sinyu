package cn.sinyu.energy.portal.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class MainDataDTO implements Serializable {
    private String locationCode;
    private String menuName;
    private String menuCode;
}
