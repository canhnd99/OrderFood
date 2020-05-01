package com.laptrinhb2a.app.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GenerateEncodePassword {
    public static String getEncodePassword(String value){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.encode(value);
    }
}
