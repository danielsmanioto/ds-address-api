package com.dsmanioto.address.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
@EqualsAndHashCode
public class User {

    private String username;

    private String password;

}
