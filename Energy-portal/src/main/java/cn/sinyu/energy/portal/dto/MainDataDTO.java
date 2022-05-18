package cn.sinyu.energy.portal.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class MainDataDTO implements Serializable {
    private Integer menuId;
    private String menuName;
}
