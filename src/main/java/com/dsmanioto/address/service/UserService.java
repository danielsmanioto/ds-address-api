package com.dsmanioto.address.service;

import java.util.Optional;

public interface UserService {

    Optional<com.dsmanioto.address.authentication.User> findByUserName(String username);

}
