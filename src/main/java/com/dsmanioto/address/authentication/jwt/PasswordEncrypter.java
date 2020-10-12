package com.dsmanioto.address.authentication.jwt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncrypter {

    private PasswordEncrypter() {}

    public static String encrypt(String password) {
        return new BCryptPasswordEncoder().encode(password);
    }

}