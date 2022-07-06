package cn.sinyu.energy.portal.VO;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class MenuVO implements Serializable {
    private Integer id;
    private String menuCode;
    private String menuName;
    private String path;
    private String locationCode;
    private List<MenuVO> menuVOS;
}
