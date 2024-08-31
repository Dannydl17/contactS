package com.contact.services;

import com.contact.data.repositories.UserRepository;
import com.contact.dtos.requests.UserRegistrationRequest;
import com.contact.dtos.responses.UserRegistrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppUserService implements UserService{
    private final UserRepository userRepository;

    @Override
    public UserRegistrationResponse register(UserRegistrationRequest request) {
        return null;
    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }

}
