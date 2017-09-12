package com.spawpaw.lab.exception;

/**
 * @author BenBenShang spawpaw@hotmail.com 2017/9/12
 */
public class EmailCannotBeNummException extends RuntimeException {
    public EmailCannotBeNummException() {
    }

    public EmailCannotBeNummException(String message) {
        super(message);
    }

    public EmailCannotBeNummException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmailCannotBeNummException(Throwable cause) {
        super(cause);
    }

    public EmailCannotBeNummException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
