package com.example.contactrestfulapi.contact;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;


public interface ContactRepository extends PagingAndSortingRepository<Contact, Long> {
    @RestResource(path = "email-equals", rel = "emailEquals")
    Page<Contact> findByEmailEquals(@Param("email") String name, Pageable p);

    @RestResource(path = "phone-equals", rel = "phoneEquals")
    Page<Contact> findByPersonalPhoneEquals(@Param("phone") String phpme, Pageable p);

    @RestResource(path = "email-or-phone", rel = "emailOrPhoneEquals")
    Page<Contact> findByEmailEqualsOrPersonalPhoneEquals(@Param("email") String email, @Param("phone") String phone, Pageable p);

    @Override
    void delete(Contact contact);
}
