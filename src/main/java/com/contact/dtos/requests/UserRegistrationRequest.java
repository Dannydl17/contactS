package com.contact.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRegistrationRequest {
    private String firstName;
    private String lastName;
    private String password;
}
