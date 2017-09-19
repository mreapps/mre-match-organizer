package com.mreapps.matchorganizer.controller;

import com.mreapps.matchorganizer.entity.User;
import com.mreapps.matchorganizer.model.LoginForm;
import com.mreapps.matchorganizer.repository.UserRepository;
import com.mreapps.matchorganizer.security.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class AuthorizationController
{
    private final JwtUtil jwtUtil;
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    @Autowired
    public AuthorizationController(JwtUtil jwtUtil, PasswordEncoder passwordEncoder, UserRepository userRepository)
    {
        this.jwtUtil = jwtUtil;
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    @PostMapping("login")
    public String login(@RequestBody LoginForm loginForm)
    {
        User user = userRepository.findByEmailAddress(loginForm.getEmailAddress());
        if (user == null)
        {
            throw new BadCredentialsException("Invalid email address or password");
        }

        if (!passwordEncoder.matches(loginForm.getPassword(), user.getEncryptedPassword()))
        {
            throw new BadCredentialsException("Invalid email address or password");
        }

        com.mreapps.matchorganizer.security.model.User u = new com.mreapps.matchorganizer.security.model.User();
        u.setId(user.getId());
        u.setEmailAddress(user.getEmailAddress());
        u.setRole(user.getRole());
        u.setVerified(user.getEmailAddressConfirmedAt() != null);
        return jwtUtil.generateToken(u);
    }

    @PostMapping("signup")
    public String signup()
    {
        /*
        TODO Input values:
        email address / username
        email address / username retyped
        password
        password retyped
        role should be ROLE_USER as default
        first name
        middle name
        last name
        gender
        date of birth
         */
        return "signup";
    }

}
