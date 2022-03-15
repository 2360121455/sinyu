package cn.sinyu.energy.portal.controller;

import cn.sinyu.energy.portal.ex.AccountDuplicateException;
import cn.sinyu.energy.portal.ex.InsertException;
import cn.sinyu.energy.portal.ex.ServiceException;
import cn.sinyu.energy.portal.ex.UsernameDuplicateException;
import cn.sinyu.energy.portal.util.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ServiceException.class)
    public R handleException(Exception e) {
        R r = null;
        if (e instanceof AccountDuplicateException) {
            r = new R(2,"注册失败！账户已经存在!");
        } else if (e instanceof UsernameDuplicateException) {
            r = new R(3,"注册失败！用户名已经存在!");
        } else if (e instanceof InsertException) {
            r = new R(4,"注册失败！服务器繁忙，请稍后再试!");
        }
        return r;
    }
}
