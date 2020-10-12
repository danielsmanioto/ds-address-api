package com.dsmanioto.address.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
public class JWTAuthenticaationExeception extends RuntimeException {

    public JWTAuthenticaationExeception(String userMessage, String message) {
        super(userMessage + "-" + message);
    }

}
