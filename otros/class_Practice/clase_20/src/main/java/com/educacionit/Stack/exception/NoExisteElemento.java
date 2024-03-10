package com.educacionit.Stack.exception;

public class NoExisteElemento extends Exception {
    public NoExisteElemento(String message) {
        super(message);
    }

    public NoExisteElemento(Throwable cause) {
        super(cause);
    }

    public NoExisteElemento(String message, Throwable cause) {
        super(message, cause);
    }

    public NoExisteElemento(String message, Throwable cause, boolean enableSupression, boolean writableStackTrace) {
        super(message, cause, enableSupression, writableStackTrace);
    }
}
