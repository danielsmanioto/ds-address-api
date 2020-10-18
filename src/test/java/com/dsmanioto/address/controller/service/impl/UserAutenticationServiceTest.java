package com.dsmanioto.address.controller.service.impl;

import com.dsmanioto.address.exception.UserAutenticationUserDontExistExeception;
import com.dsmanioto.address.model.User;
import com.dsmanioto.address.service.UserService;
import com.dsmanioto.address.service.impl.UserAutenticationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class UserAutenticationServiceTest {

    @InjectMocks
    private UserAutenticationService userAutenticationService;

    @Mock
    private UserService userService;

    @Test
    public void checkLoginSuccess() {
        Optional<User> user = Optional.of(User.builder()
                .username("daniel")
                .password("123")
                .build());
        BDDMockito
                .given(userService.findByUserName("daniel"))
                .willReturn(user);

        userAutenticationService.loadUserByUsername("daniel");
    }

    @Test
    public void checkLoginUnautorized() {
        BDDMockito
                .given(userService.findByUserName("caroline"))
                .willReturn(Optional.empty());

        try {
            userAutenticationService.loadUserByUsername("caroline");
            Assertions.assertTrue(false);
        } catch (UserAutenticationUserDontExistExeception e) {
            Assertions.assertTrue(true);
        }
    }

}
