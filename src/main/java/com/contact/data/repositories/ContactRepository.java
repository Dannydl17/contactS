package com.contact.data.repositories;

import com.contact.data.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {

//    Contact findEntryByFirstNameLastNameAndPhoneNumber(String firstName, String lastName, String phoneNumber);

}
