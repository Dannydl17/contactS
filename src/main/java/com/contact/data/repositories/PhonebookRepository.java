package com.contact.data.repositories;

import com.contact.data.models.Phonebook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhonebookRepository extends JpaRepository<Phonebook, Long> {

}
