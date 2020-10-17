package com.dsmanioto.address.controller.service.impl;

import com.dsmanioto.address.model.User;
import com.dsmanioto.address.repository.UserRepository;
import com.dsmanioto.address.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl service;

    @Mock
    private UserRepository repository;

    @Test
    public void checkUsernameExists() {
        BDDMockito
                .given(repository.findByUsername("daniel"))
                .willReturn(createUser());

        Optional<User> user = service.findByUserName("daniel");

        Assertions.assertEquals("daniel", user.get().getUsername());
        Assertions.assertEquals("123", user.get().getPassword());
    }

    private Optional<User> createUser() {
        Optional<User> userCreated = Optional.of(User.builder()
                .username("daniel")
                .password("123")
                .build());
        return userCreated;
    }

}

