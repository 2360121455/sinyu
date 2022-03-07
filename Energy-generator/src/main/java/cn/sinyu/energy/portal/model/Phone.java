package cn.sinyu.energy.portal.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalTime;
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
 * @since 2022-03-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("phone")
public class Phone implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private Integer id;

    @TableId("phone_name")
    private String phoneName;

    @TableField("adr")
    private String adr;

    @TableField("equip_name")
    private String equipName;

    @TableField("equip_code")
    private String equipCode;

    @TableField("numerical")
    private Double numerical;

    @TableField("unit")
    private String unit;

    @TableField("photo")
    private byte[] photo;

    @TableField("note")
    private String note;

    @TableField("time")
    private LocalTime time;

    @TableField("date")
    private LocalDate date;

    @TableField("year")
    private String year;


}
