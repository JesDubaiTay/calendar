package com.company.calendar.entity;

import io.jmix.core.security.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MyUserRepository implements UserRepository {
    @Override
    public UserDetails getSystemUser() {
        return null;
    }

    @Override
    public UserDetails getAnonymousUser() {
        return null;
    }

    @Override
    public List<? extends UserDetails> getByUsernameLike(String substring) {
        return List.of();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
    // Реализация методов
}

