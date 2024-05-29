package com.fish.anr_seafoods_erp.controller;


import com.fish.anr_seafoods_erp.dto.request.CreateUserRequest;
import com.fish.anr_seafoods_erp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/create-user")
    public ResponseEntity<?> createUser(@RequestBody CreateUserRequest createUserRequest) {


         userService.createUser(createUserRequest);
            return ResponseEntity.ok("User Profile created successfully");

    }
}
