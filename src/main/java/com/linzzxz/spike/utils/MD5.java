package com.linzzxz.spike.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Component;

@Component
public class MD5 {
    private static String md5(String src) {
        return DigestUtils.md5Hex(src);
    }

    public static String encryptPass(String pass, String salt) {
        return md5(pass + salt);
    }
}
