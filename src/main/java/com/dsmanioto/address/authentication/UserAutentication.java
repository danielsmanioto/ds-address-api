package com.dsmanioto.address.authentication;

import com.dsmanioto.address.exception.UserAutenticationUserDontExistExeception;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserAutentication implements UserDetailsService {

    private static final String USER_LOGIN = "daniel";
    private static final String USER_PASSWORD = "$2y$12$EWx.9uAywAp4S.YpzUFEuO9LpQqPb3xcIS8mFq5FbD9B6jpx8vI3S";

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        if(!USER_LOGIN.equals(username)) {
            throw new UserAutenticationUserDontExistExeception("User " + username + " don't exist");
        }

        return new User(username, USER_PASSWORD, getAuthoritiesByUser());
    }

    private List<GrantedAuthority> getAuthoritiesByUser() {
        List<GrantedAuthority> authorityListAdmin = AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_ADMIN");
        return authorityListAdmin;
    }

}
