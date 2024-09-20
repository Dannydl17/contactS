package com.contact.controller;

import com.contact.dtos.requests.UserRegistrationRequest;
import com.contact.dtos.responses.UserRegistrationResponse;
import com.contact.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

//    @PostMapping("/")
//    public ResponseEntity<UserRegistrationResponse> register(@RequestBody UserRegistrationRequest request){
//
//    }
}
