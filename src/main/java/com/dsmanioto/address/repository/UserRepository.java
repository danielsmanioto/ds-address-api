package com.dsmanioto.address.repository;

import com.dsmanioto.address.model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class UserRepository {

    private static final String PASSWORD_DEFAULT = "$2y$12$EWx.9uAywAp4S.YpzUFEuO9LpQqPb3xcIS8mFq5FbD9B6jpx8vI3S";

    private List<User> users = Arrays.asList(new User("daniel", PASSWORD_DEFAULT),
            new User("daniel", PASSWORD_DEFAULT),
            new User("admin", PASSWORD_DEFAULT),
            new User("carol", PASSWORD_DEFAULT),
            new User("perry", PASSWORD_DEFAULT),
            new User("root", PASSWORD_DEFAULT));

    public List<User> findAll() {
        return users;
    }

    public Optional<User> findByUsername(String username) {
        List<User> usersRet = this.users
                .stream()
                .filter(user -> username.equals(user.getUsername()))
                .collect(Collectors.toList());

        return usersRet.stream().findFirst();
    }

}
