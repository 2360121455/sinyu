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
 * @since 2022-02-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("userlist")
public class Userlist implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private Integer id;

    @TableId("user_code")
    private String userCode;

    @TableField("user_name")
    private String userName;

    @TableField("account")
    private String account;

    @TableField("password")
    private String password;

    @TableField("bm_code")
    private String bmCode;

    @TableField("role_code")
    private String roleCode;

    @TableField("state")
    private String state;


}
