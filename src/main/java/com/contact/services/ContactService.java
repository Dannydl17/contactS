package com.contact.services;

import com.contact.data.models.Contact;
import com.contact.dtos.requests.ContactCreateRequest;

public interface ContactService {
    Contact createContact(ContactCreateRequest request);

    void deleteAll();

    long count();

//    Contact updateContact(ContactCreateRequest request, String number);

}
