package com.contact.services;

import com.contact.dtos.requests.UserRegistrationRequest;
import com.contact.dtos.responses.UserRegistrationResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
        request.setPassword("1234");

        UserRegistrationResponse response = userService.register(request);
        assertNotNull(response);
        assertNotNull(response.getId());
    }

    @Test
    public void testThatUserCanLoginTest(){


    }
}
