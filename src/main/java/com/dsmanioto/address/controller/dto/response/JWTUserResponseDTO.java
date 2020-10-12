package com.dsmanioto.address.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class JWTUserResponseDTO implements Serializable {

    private static final long serialVersionUID = -8091879091924046844L;

    private final String jwttoken;

}
