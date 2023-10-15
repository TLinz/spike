package com.linzzxz.spike.utils;

import org.thymeleaf.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final Pattern mobile_pattern = Pattern.compile("^1[3-9]\\d{9}$");

    public static boolean verifyPhoneNum(String phoneNum) {
        if (StringUtils.isEmpty(phoneNum)) {
            return false;
        }
        Matcher matcher = mobile_pattern.matcher(phoneNum);
        return matcher.matches();
    }

}
