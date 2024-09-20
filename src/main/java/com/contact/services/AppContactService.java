package com.contact.services;

import com.contact.data.models.Contact;
import com.contact.data.repositories.ContactRepository;
import com.contact.dtos.requests.ContactCreateRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppContactService implements ContactService{
    private final ContactRepository contactRepository;

    @Override
    public Contact createContact(ContactCreateRequest request) {
        Contact contact = new Contact();
        contact.setFirstName(request.getFirstName());
        contact.setLastName(request.getLastName());
        contact.setPhoneNumber(request.getPhoneNumber());
        return contactRepository.save(contact);
    }

    @Override
    public void deleteAll() {
        contactRepository.deleteAll();
    }

    @Override
    public long count() {
        return contactRepository.count();
    }

//    @Override
//    public Contact updateContact(ContactCreateRequest request, String number) {
////        Contact contact = findContact(request.getFirstName(),request.getLastName(),request.getPhoneNumber());
//        contact.setPhoneNumber(contact.getPhoneNumber() + " " + number);
//        Contact savedContact = contactRepository.save(contact);
//        return savedContact;
//    }

//    private Contact findContact(String firstName, String lastName, String phoneNumber) {
//        return contactRepository.findEntryByFirstNameLastNameAndPhoneNumber(firstName, lastName, phoneNumber);
//    }
}
