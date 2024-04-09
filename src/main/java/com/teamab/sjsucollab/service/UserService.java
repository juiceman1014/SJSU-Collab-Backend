package com.teamab.sjsucollab.service;

import com.teamab.sjsucollab.entity.User;
import com.teamab.sjsucollab.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerNewUserAccount(User user) {
        // Here you can add checks for existing email, etc.
        return userRepository.save(user);
    }
}
