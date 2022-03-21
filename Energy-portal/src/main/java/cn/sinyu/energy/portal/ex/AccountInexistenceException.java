package cn.sinyu.energy.portal.ex;
//账号不存在异常
public class AccountInexistenceException extends ServiceException{
    public AccountInexistenceException() {
    }

    public AccountInexistenceException(String message) {
        super(message);
    }

    public AccountInexistenceException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountInexistenceException(Throwable cause) {
        super(cause);
    }

    public AccountInexistenceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
