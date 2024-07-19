package com.user.modules.profile.controller;

import com.user.Services.UserService;
import com.user.infra.entity.User;
import com.user.modules.profile.request.UserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(
        value = "user/"
)
public class UserProfileController {
    private final UserService userService;

    public UserProfileController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping ("save")
    public User addUser (@RequestBody User user )
    {
        return this.userService.addUser(user);
    }
}
