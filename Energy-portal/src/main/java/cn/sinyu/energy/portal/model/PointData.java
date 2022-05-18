package cn.sinyu.energy.portal.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zcd
 * @since 2022-05-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("point_data")
public class PointData implements Serializable {

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

    @TableField("a_voltage")
    private Double av;

    @TableField("b_voltage")
    private Double bv;

    @TableField("c_voltage")
    private Double cv;

    @TableField("currentt")
    private Double currentt;

    @TableField("state")
    private String state;

    @TableField("date")
    private String date;

    @TableField("menu_id")
    private Integer menuId;


}
