package com.dsmanioto.address.service.impl;

import com.dsmanioto.address.model.User;
import com.dsmanioto.address.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private static final String USER_LOGIN = "daniel";
    private static final String USER_PASSWORD = "$2y$12$EWx.9uAywAp4S.YpzUFEuO9LpQqPb3xcIS8mFq5FbD9B6jpx8vI3S";

    @Override
    public Optional<User> findByUserName(String username) {
        return Optional.of(User.builder()
                .username(USER_LOGIN)
                .password(USER_PASSWORD)
                .build());
    }

}
