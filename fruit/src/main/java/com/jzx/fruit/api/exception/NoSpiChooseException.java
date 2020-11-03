package com.jzx.fruit.api.exception;

/**
 * @program: fruit
 * @description:
 * @author: jzx
 * @create: 2020-11-02 13:34
 **/
public class NoSpiChooseException extends RuntimeException {

    public NoSpiChooseException() {
    }

    public NoSpiChooseException(String message) {
        super(message);
    }

    public NoSpiChooseException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSpiChooseException(Throwable cause) {
        super(cause);
    }

    public NoSpiChooseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
