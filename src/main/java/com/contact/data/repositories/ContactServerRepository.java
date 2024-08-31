package com.contact.data.repositories;

import com.contact.data.models.ContactServer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactServerRepository  extends JpaRepository<ContactServer, Long> {

}
