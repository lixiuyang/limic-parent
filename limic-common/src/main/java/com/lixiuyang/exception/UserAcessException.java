package com.lixiuyang.exception;


public class UserAcessException extends Exception {

    private String errorMessage;
    public UserAcessException(String message, String errorMessage) {
        super(message);
        this.errorMessage = errorMessage;
    }

    public UserAcessException(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    public UserAcessException() {
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
