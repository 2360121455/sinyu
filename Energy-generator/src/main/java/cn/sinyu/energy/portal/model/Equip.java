package cn.sinyu.energy.portal.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
@TableName("equip")
public class Equip implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private Integer id;

    @TableId("equip_code")
    private String equipCode;

    @TableField("equip_name")
    private String equipName;

    @TableField("num")
    private String num;

    @TableField("power")
    private Double power;

    @TableField("department")
    private String department;

    @TableField("buy_date")
    private LocalDate buyDate;

    @TableField("tyoe")
    private String tyoe;

    @TableField("adr")
    private String adr;

    @TableField("measure")
    private String measure;

    @TableField("note")
    private String note;


}
