package cn.sinyu.energy.portal.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 新增地址参数类
 */
@Data
public class AddLocationDTO implements Serializable {
    //地址名称
    private String locationName;
    //父地址Code
    private String parentCode;
    //父地址等级，根据这个值计算新增地址的等级
    private Integer parentLevel;
    //父地址名称
    private String parentName;
}
