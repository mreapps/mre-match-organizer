package com.mreapps.matchorganizer.controller;

import com.mreapps.matchorganizer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class MessageController
{
    private final UserRepository userRepository;

    @Autowired
    public MessageController(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @GetMapping("registerred")
    public boolean registerred(@RequestParam String phoneNumber)
    {
        return this.userRepository.findByPhoneNumber(phoneNumber) != null;
    }

}
