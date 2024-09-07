package com.contact.services;

import com.contact.data.models.User;
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
        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setPassword(request.getPassword());

        User savedUser = userRepository.save(user);
        UserRegistrationResponse response = new UserRegistrationResponse();
        response.setId(savedUser.getId());
        return response;
    }

    @Override
    public void deleteAll() {
        userRepository.deleteAll();
    }

}
