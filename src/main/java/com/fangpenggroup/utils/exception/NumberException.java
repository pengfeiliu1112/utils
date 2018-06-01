package com.fangpenggroup.utils.exception;

public class NumberException extends Exception {

    public static String ARRAY_LENGTH_EMPTY_ERROR = "array.length.empty.error";
    public static String ARRAY_LENGTH_INSUFFICIENT_ERROR = "array.length.insufficient.error";

    public NumberException() {
    }

    public NumberException(String message) {
        super(message);
    }

    public NumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
