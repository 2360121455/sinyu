package cn.sinyu.energy.portal.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EditLocationDTO implements Serializable {
    private String locationName;
    private String editCode;
}
