package com.dsmanioto.address.service;

import com.dsmanioto.address.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findByUserName(String username);

}
