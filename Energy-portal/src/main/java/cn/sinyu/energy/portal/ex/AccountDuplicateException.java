package cn.sinyu.energy.portal.ex;
//账户重复异常
public class AccountDuplicateException extends ServiceException{
    public AccountDuplicateException() {
    }

    public AccountDuplicateException(String message) {
        super(message);
    }

    public AccountDuplicateException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountDuplicateException(Throwable cause) {
        super(cause);
    }

    public AccountDuplicateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
