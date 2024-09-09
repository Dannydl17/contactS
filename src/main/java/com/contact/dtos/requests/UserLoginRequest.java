package com.contact.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginRequest {
    private String firstName;
    private String lastName;
}
