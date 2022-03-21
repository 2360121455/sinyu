package cn.sinyu.energy.portal.util;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)//链式
public class R implements Serializable {
    private Integer state;
    private String message;

    public static R ok(){
        return new R().setState(State.OK);
    }

    public static R failure(Integer state,String message){
        return new R().setState(state).setMessage(message);
    }

    public static R failure(Integer state,Throwable e){
        return failure(state,e.getMessage());
    }

    public interface State{
        //成功
        Integer OK = 2000;
        //用户名重复
        Integer ERR_USER_NAME_DUPLICATE = 4000;
        //账号重复
        Integer ERR_ACCOUNT_DUPLICATE = 4010;
        //插入异常
        Integer ERR_INSERT = 4020;
        //验证异常
        Integer ERR_INVALID_PARAMETER = 4030;
    }

}
