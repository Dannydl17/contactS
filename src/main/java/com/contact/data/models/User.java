package com.contact.data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Setter
@Getter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String password;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private ContactServer contactServer = new ContactServer();
}
