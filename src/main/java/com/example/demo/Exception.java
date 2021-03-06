package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class Exception extends java.lang.Exception {
    private static final long serialVersionUID = 1L;
    public Exception(String message) {
        super(message);
    } public Exception(String message, Throwable t) {
        super(message, t);
    }
}
