package com.mmcoe.pojo;

public class IllegalAmountException extends RuntimeException {

    public IllegalAmountException(String message) {
        super(message);
    }
}