package com.example.contactrestfulapi.contact;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;


public interface ContactRepository extends PagingAndSortingRepository<Contact, Long> {
    @RestResource(path = "email-is", rel = "email-is")
    Page<Contact> findByEmailIs(@Param("email") String name, Pageable p);
}
