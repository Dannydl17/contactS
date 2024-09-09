package com.contact.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ContactCreateRequest {
    private String firstName;
    private String lastName;
    private String phoneNumber;
}
