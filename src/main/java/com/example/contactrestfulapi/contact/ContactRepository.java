package com.example.contactrestfulapi.contact;

import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {

}
