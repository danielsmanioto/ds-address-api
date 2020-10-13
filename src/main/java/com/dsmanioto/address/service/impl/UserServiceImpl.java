package com.dsmanioto.address.service.impl;

import com.dsmanioto.address.model.User;
import com.dsmanioto.address.repository.UserRepository;
import com.dsmanioto.address.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public Optional<User> findByUserName(String username) {
        return repository.findByUsername(username);
    }

}
