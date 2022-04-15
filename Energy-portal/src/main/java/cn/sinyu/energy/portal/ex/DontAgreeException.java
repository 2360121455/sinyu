package cn.sinyu.energy.portal.ex;
//两次密码不一致异常
public class DontAgreeException extends ServiceException{
    public DontAgreeException() {
    }

    public DontAgreeException(String message) {
        super(message);
    }

    public DontAgreeException(String message, Throwable cause) {
        super(message, cause);
    }

    public DontAgreeException(Throwable cause) {
        super(cause);
    }

    public DontAgreeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
