package cn.sinyu.energy.portal.VO;

import cn.sinyu.energy.portal.model.Menu;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class NodeVO implements Serializable {
    private String menuCode;
    private String menuLevel;
    private String menuName;
    private List<Menu> menuList;
}
