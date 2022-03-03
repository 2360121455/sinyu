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
@TableName("main_data")
public class MainData implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private Integer id;

    @TableField("adr")
    private String adr;

    @TableId("equip_code")
    private String equipCode;

    @TableField("pro_type")
    private String proType;

    @TableField("collector_name")
    private String collectorName;

    @TableField("rank")
    private String rank;

    @TableField("collector_number")
    private Double collectorNumber;

    @TableField("unit")
    private String unit;

    @TableField("state")
    private String state;

    @TableField("time")
    private LocalTime time;

    @TableField("date")
    private LocalDate date;

    @TableField("year")
    private String year;


}
