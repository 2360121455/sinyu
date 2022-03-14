package cn.sinyu.energy.portal.util;

import lombok.Data;

import java.io.Serializable;

@Data
public class R implements Serializable {
    private Integer state;
    private String message;
}
