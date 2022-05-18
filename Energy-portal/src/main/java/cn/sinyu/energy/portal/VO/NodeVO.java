package cn.sinyu.energy.portal.VO;

import lombok.Data;

import java.io.Serializable;

@Data
public class NodeVO implements Serializable {
    private Integer id;
    private String menuCode;
    private String menuName;
    private String path;
    private String parentName;
}
