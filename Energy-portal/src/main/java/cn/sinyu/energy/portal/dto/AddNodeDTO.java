package cn.sinyu.energy.portal.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AddNodeDTO implements Serializable {
    private String menuName;
    private String path;
    private String parentCode;
    private Integer parentLevel;
    private String parentName;
    private String type;
}
