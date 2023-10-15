package com.linzzxz.spike.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum RespBeanEnum {
    SUCCESS(200, "Success"),
    ERROR(500, "Internal Server Error"),

    //Login
    LOGIN_ERROR(500210, "Invalid Account/Password"),
    PHONE_NUM_ERROR(500211, "Invalid Phone Number");

    private final Integer code;
    private final String message;
}
