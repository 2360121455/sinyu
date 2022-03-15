package cn.sinyu.energy.portal.util;

import lombok.Data;

import java.io.Serializable;

@Data
public class R implements Serializable {
    private Integer state;
    private String message;

    public R() {
    }

    public R(Integer state, String message) {
        this.state = state;
        this.message = message;
    }
}
