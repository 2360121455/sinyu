package cn.sinyu.energy.portal.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author zcd
 * @since 2022-02-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("call_police")
public class CallPolice implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private Integer id;

    @TableId("event")
    private String event;

    @TableField("adr")
    private String adr;

    @TableField("attribute")
    private String attribute;

    @TableField("classified")
    private String classified;

    @TableField("hy_indicators")
    private Double hyIndicators;

    @TableField("kh_indicators")
    private Double khIndicators;

    @TableField("ss_indicators")
    private Double ssIndicators;

    @TableField("time")
    private LocalTime time;

    @TableField("date")
    private LocalDate date;

    @TableField("year")
    private String year;


}
