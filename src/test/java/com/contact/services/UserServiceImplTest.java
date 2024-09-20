package com.contact.services;

import com.contact.dtos.requests.UserLoginRequest;
import com.contact.dtos.requests.UserRegistrationRequest;
import com.contact.dtos.responses.UserRegistrationResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.contact.utils.Constants.USER_REGISTRATION_SUCCESSFUL_MESSAGE;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private AppUserService userService;

    @BeforeEach
    public void startEachTestWith(){
        userService.deleteAll();
    }

    @Test
    public void testThatUsersCanRegisterTest(){
        UserRegistrationRequest request = new UserRegistrationRequest();
        request.setFirstName("Daniel");
        request.setLastName("Adeniyi");
        request.setEmail("test@email.com");
        request.setPhoneNumber("090234567891");

        UserRegistrationResponse response = userService.register(request);
        assertNotNull(response);
        assertNotNull(response.getId());
        assertThat(response.getMessage()).isEqualTo(USER_REGISTRATION_SUCCESSFUL_MESSAGE);
    }

    @Test
    public void testThatUserCanLoginTest(){
        UserRegistrationRequest request = new UserRegistrationRequest();
        request.setFirstName("Danny");
        request.setLastName("Adeniyi");
        request.setEmail("test@email.com");
        request.setPhoneNumber("090234567891");

        UserRegistrationResponse response = userService.register(request);
        assertNotNull(response);
        assertNotNull(response.getId());
        assertThat(response.getMessage()).isEqualTo(USER_REGISTRATION_SUCCESSFUL_MESSAGE);

        UserLoginRequest loginRequest = new UserLoginRequest();
        loginRequest.setFirstName("Danny");
        loginRequest.setLastName("Adeniyi");
        loginRequest.setEmail("test@email.com");
        loginRequest.setPhoneNumber("090234567891");

        UserLoginResponse
    }
}
