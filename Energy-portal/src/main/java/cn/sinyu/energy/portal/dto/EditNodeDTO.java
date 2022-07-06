package cn.sinyu.energy.portal.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EditNodeDTO implements Serializable {
    private String menuName;
    private String editCode;
    private String path;
}
