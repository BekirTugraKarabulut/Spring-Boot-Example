package com.tugra.exception;

import lombok.Getter;

@Getter
public enum MessageType {

    EMAİL_HATASİ("9999","Email daha önce kullanılmış.");

    private String code;
    private String message;

    MessageType(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
