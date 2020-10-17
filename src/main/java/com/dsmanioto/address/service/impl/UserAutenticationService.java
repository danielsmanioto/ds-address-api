package com.dsmanioto.address.service.impl;

import com.dsmanioto.address.exception.UserAutenticationUserDontExistExeception;
import com.dsmanioto.address.model.User;
import com.dsmanioto.address.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserAutenticationService implements UserDetailsService {

    @Autowired
    private UserService service;

    @Override
    public UserDetails loadUserByUsername(String username) {
        Optional<User> user = service.findByUserName(username);

        if(!user.isPresent()) {
            throw new UserAutenticationUserDontExistExeception("User " + username + " don't exist");
        }

        return new org.springframework.security.core.userdetails.User(username, user.get() .getPassword(), getAuthoritiesByUser());
    }

    private List<GrantedAuthority> getAuthoritiesByUser() {
        return AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_ADMIN");
    }

}
