package com.dsmanioto.address.controller.model;

import com.dsmanioto.address.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testValidateFields() {
        User user = User.builder()
                .username("danielsmanioto")
                .password("123")
                .build();

        Assertions.assertEquals("danielsmanioto", user.getUsername());
        Assertions.assertEquals("123", user.getPassword());
    }

}
