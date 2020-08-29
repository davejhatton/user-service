package com.leanperiod.userservice.api;

import com.leanperiod.userservice.domain.User;
import com.leanperiod.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("users")
    public List<User> getAllusers() {

        log.info("Retrieving users");
        return userRepository.findAll();
    }
}
