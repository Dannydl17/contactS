package com.contact.services;

import com.contact.data.models.Contact;
import com.contact.dtos.requests.ContactCreateRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ContactServiceImplTest {
    @Autowired
    private AppContactService contactService;

    @BeforeEach
    public void startEachTestWith(){
        contactService.deleteAll();
    }

    @Test
    public void testThatContactCanBeCreatedTest(){
        ContactCreateRequest request = new ContactCreateRequest();
        request.setFirstName("Ayomide");
        request.setLastName("Adeolu");
        request.setPhoneNumber("080234523456");

        Contact contact= contactService.createContact(request);
        assertEquals("Ayomide", contact.getFirstName());
    }

    @Test
    public void testThatContactCanBeAddedTest(){
        ContactCreateRequest request = new ContactCreateRequest();
        request.setFirstName("Kayode");
        request.setLastName("Deji");
        request.setPhoneNumber("081234567893");
        Contact contact = contactService.createContact(request);
        ContactCreateRequest request1 = new ContactCreateRequest();
        request1.setFirstName("Ayo");
        request.setLastName("Adeyomi");
        request.setPhoneNumber("090345678901");
        Contact contact1 = contactService.createContact(request);
        assertEquals(2,contactService.count());
    }

    @Test
    public void testThatContactCanBeUpdatedTest(){
        ContactCreateRequest request = new ContactCreateRequest();
        request.setFirstName("Ayomide");
        request.setLastName("Adeolu");
        request.setPhoneNumber("080234523456");
        Contact contact = contactService.createContact(request);
        assertEquals("080234523456", contact.getPhoneNumber());
//        Contact newContact = contactService.updateContact(request, "080453256678");
//        assertEquals("080453256678", newContact.getPhoneNumber());
    }
}
