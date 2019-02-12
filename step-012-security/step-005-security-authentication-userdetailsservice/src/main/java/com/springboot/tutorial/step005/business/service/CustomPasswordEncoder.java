package com.springboot.tutorial.step005.business.service;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * Created by saman on 10/22/2017.
 */
@Component("customPasswordEncoder")
public class CustomPasswordEncoder implements PasswordEncoder {

    public static final String NAME = "customPasswordEncoder";
    @Override
    public String encode(CharSequence rawPassword) {
        return BCrypt.hashpw(rawPassword.toString(), BCrypt.gensalt(12));
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return BCrypt.checkpw(rawPassword.toString(), encodedPassword);
    }
}